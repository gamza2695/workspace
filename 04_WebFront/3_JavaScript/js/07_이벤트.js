
/* 인라인 이벤트 모델 */
function inlineEventModel(btn){

  console.log(btn); // 클릭 이벤트가 발생한 요소가 버튼인지 확인

  console.log(btn.style.backgroundColor); // 클릭한 요소의 배경색 얻어오기


  if(btn.style.backgroundColor != "pink"){
    btn.style.backgroundColor = "pink"; // 클릭한 요소의 배경색으로 pink 추가
  }
  else{
    // Attribute : 속성
    btn.removeAttribute("style"); // style 속성 제거
  }
}

// =============================================================== //

/* 고전 이벤트 모델 */

// 아이디가 test2-1인 요소를 선택해 변수에 저장
const a = document.getElementById("test2-1");

// 요소.이벤트리스너 = 이벤트 핸들러
a.onclick = function(){ // function(){} : 익명 함수(이벤트 핸들러로 많이 사용)
  alert("test2-1 클릭");
}

// 이벤트 제거 : #test2-2 클릭 시 #test2-1의 클릭 이벤트 제거
const b = document.querySelector("#test2-2");

b.onclick = function(){
  // a == #test2-1
  // #test2-1의 onclick 속성에 null을 대입해서 덮어쓰기
  a.onclick = null; 
  alert("#test2-1 이벤트 제거");
}

// 고전 이벤트 모델 단점
// -> 한 요소의 같은 이벤트리스너에 여러 이벤트 핸들러를 대입할 수 없다

const c = document.querySelector("#test2-3");

// #test2-3 클릭 시 버튼의 배경색을 yellow로 변경
c.onclick = function(){
  c.style.backgroundColor = "yellow";
}

// #test2-3 클릭 시 버튼의 글자 크기를 30px로 변경 => 최종적으로 이것만 적용
c.onclick = function(){
  c.style.fontSize = '30px';
}


// =============================================================== //
/***** 표준 이벤트 모델 ******/

/* [작성법]
  요소.addEventListener("click", function(){});
                       (이벤트명, 이벤트 핸들러)
*/

// 아이디가 test3인 요소에 click 했을 때에 대한 동작을 추가
document.getElementById("test3").addEventListener("click", function(){

  // 클릭된 요소의 너비가 10px 증가
  // 고전/표준 이벤트 핸들러 내부에서 this : 이벤트가 발생한 요소
  console.log(this);

  // 요소.clientWidth : 요소의 너비(테두리 제외)
  // -> css/style 속성으로 지정된 너비를 얻어올 때 사용
  console.log(this.clientWidth);

  // 요소.style.width : 요소의 style 속성 중 width의 값을 얻어옴
  // -> 요소 자체에 작성된 style 속성의 값을 얻어올 때 사용(inline으로)
  // console.log(this.style.width);

  // clientWidth는 getter만 됨
  // this.clientWidth = '300px';
  
  // style.width로 가능
  // this.style.width = '300px'; // 현재 요소 너비 변경

  this.style.width = this.clientWidth + 10 + 'px';
});



// #test3 요소에 click 이벤트 리스너를 또 추가
document.getElementById("test3").addEventListener("click", function(e){

  // 이벤트 핸들러 매개별수 e 또는 event
  // -> 이벤트 객체(이벤트 관련 정보가 담긴 객체)가 전달됨

  // e.target : 이벤트가 발생한 요소
  console.log(e);
  console.log(e.target);

  // 현재 요소의 높이를 변경
  e.target.style.height = e.target.clientHeight + 10 + 'px';

})


// =============================================================== //
/* 입력한 색상으로 배경색 변경 */

const btn4 = document.getElementById("btn4");
const box = document.getElementById("box4");
const color = document.getElementById("input4");

btn4.addEventListener("click", function(){
  box.style.backgroundColor = color.value;
})

// input 태그에서 엔터 입력 시 배경색 변경
color.addEventListener('keyup', function(e){
  // e : 이벤트 객체
  // e.key : 입력한 키 (키 관련 이벤트 객체만 확인 가능)
  // e.target : 이벤트가 발생한 요소(여기서는 #input4)
  // console.log(e.key);
  if(e.key == "Enter"){
    box.style.backgroundColor = e.target.value;
  }
})



// =============================================================== //
/* a태그 기본 이벤트 제거 */
document.getElementById('move').addEventListener("click",function(e){

  // e : 이벤트 객체
  // prevent : 하지 못하게 막다
  // default : 기본

  e.preventDefault(); // HTML 요소의 기본 이벤트 막음(제거)
})


/* form 태그 기본 이벤트 제거 */

// // 방법1. e.preventDefault()
// // form 태그가 제출되었을 때
// document.getElementById('login').addEventListener("submit", function(e){

//   //alert("제출되었습니다.");

//   e.preventDefault();
// })


// // 방법 2,3은 참고
// // 방법 2. 인라인 이벤트 모델 onsubmit 이용
// function testFn(){
//   const id = document.getElementById("input-id");
//   const pw = document.getElementById("input-pw");

//   // 아이디 또는 비밀번호를 입력하지 않았을 때
//   if(id.value.trim().length == 0 || pw.value.trim().length == 0){
//     return false;
//   }
  
//   // 둘 다 입력한 경우
//   return true;
// }

// 방법 3. 일반 버튼 클릭으로 제출 막음

// #login-btn2 버튼이 클릭되었을 때
const loginBtn2 = document.querySelector("#login-btn2");
loginBtn2.addEventListener("click", function(){
  const id = document.getElementById("input-id");
  const pw = document.getElementById("input-pw");

  // 아이디, 비밀번호 둘다 입력했을 때
  if(id.value.trim().length != 0   && pw.value.trim().length != 0){

    /* document.form태그 name속성 == 해당 form 요소 선택 */
    /* form 요소.submit() : form 제출 */
    // 문서 내에서 name 속성 값이 loginForm인 form 태그를 제출 시킴
    document.loginForm.submit();
  }
});




// =============================================================== //

// const createBtn = document.querySelector("#create-btn");
// const clacBtn = document.querySelector("#calc");

// createBtn.addEventListener("click", function(){
//   const num = document.querySelector("#count-input").value;
//   const list = document.querySelector("#list");

//   if(num<=0){
//     alert("1 이상의 숫자를 입력해주세요");
//     return;
//   }

//   // list 내부요소 삭제
//   list.innerHTML = "";

//   for(let i=0; i<num; i++){    
//     list.innerHTML += "<li><input type='number' class='list-input'></li>";
//   }

//   /* body 태그 제일 마지막으로 이동 */
//   document.body.scrollIntoView(false);

// })

// clacBtn.addEventListener("click", function(){

//   // 계산하기 버튼 클릭 시점에
//   // 문서에 존재하는 .list-input을 모두 읽어와 배열로 반환
//   const inputNum = document.getElementsByClassName("list-input");
//   const calcResult = document.querySelector("#calc-result");
//   let result = 0;

//   for(let i=0; i<inputNum.length;i++){


//     if(inputNum[i].value == ""){
//       alert("입력되지 않은 input이 있습니다");

//       // 입력되지 않은 input으로 초점이동
//       inputNum[i].focus();

//       return; // 함수 종료
//     }

//     // if(inputNum[i].value.trim().length == 0){
//     //   alert("입력되지 않은 input이 있습니다");
//     //   return false;
//     // }

//     // input에서 얻어온 값은 기본적으로 string
//     result += Number(inputNum[i].value) ;
//   }
//   calcResult.innerHTML = result;
// })

// ========================================================

/* 
- 입력 칸 생성 제한(1칸 ~ 10칸)

- 입력 칸 생성에서 엔터 누르면 생성

- 합계 옆 -> 평균 출력

- 생성된 input에 입력할 때 마다
  결과에 누적 (난이도 Hard)

*/

// ========================================================

const createBtn = document.querySelector("#create-btn");
const clacBtn = document.querySelector("#calc");
const list = document.querySelector("#list");
const num = document.querySelector("#count-input");

createBtn.addEventListener("click", function(){

  // 입력 칸 생성 제한(1칸 ~ 10칸)
  if(num.value<1 || num.value>10){
    alert("1 이상 10 이하의 숫자를 입력해주세요");
    return;
  }

  list.innerHTML = "";

  for(let i=0; i<num.value; i++){    
    list.innerHTML += "<li><input type='number' class='list-input'></li>";
  }

  document.body.scrollIntoView(false);
})



// 입력 칸 생성에서 엔터 누르면 생성
num.addEventListener('keyup', function(e){
  if(e.key == "Enter"){
    if(num.value<1 || num.value>10){
      alert("1 이상 10 이하의 숫자를 입력해주세요");
      return;
    }
  
    list.innerHTML = "";
  
    for(let i=0; i<num.value; i++){    
      list.innerHTML += "<li><input type='number' class='list-input'></li>";
    }

    document.body.scrollIntoView(false);
  }
})


clacBtn.addEventListener("click", function(){

  const inputNum = document.getElementsByClassName("list-input");
  const calcResult = document.querySelector("#calc-result");
  let result = 0;

  for(let i=0; i<inputNum.length;i++){

    if(inputNum[i].value == ""){
      alert("입력되지 않은 input이 있습니다");
      inputNum[i].focus();
      return; 
    }

    result += Number(inputNum[i].value) ;
  }

  let avg = result/inputNum.length;

  // 합계 옆 -> 평균 출력
  calcResult.innerHTML = "합계 : " + result + " / 평균 : " + avg;
})







