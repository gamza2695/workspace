const signupForm = document.signupForm;
const inputId = document.getElementById("input-id");
const inputPw = document.getElementById("input-pw");
const inputPwCheck = document.getElementById("input-pw-check");
const inputEmail = document.getElementById("input-email");
const inputAddress= document.getElementById("input-address");

const checkList = {
  "input-id" : false,
  "input-pw" : false,
  "input-pw-check" : false
};


/* 아이디 */
inputId.addEventListener("input", e => {

  if(val.length === 0){ 
    checkList["input-id"] = false;
    return;
  }

  checkList["input-id"] = false;
  inputId.nextElementSibling.nextElementSibling.style.color = 'rgb(238, 238, 238)';
});


/* 비밀번호 */
inputPw.addEventListener("click", e => {

  const val = inputPw.value.trim();
  const span = e.target.nextElementSibling.nextElementSibling;
  inputPw.value = val;

  if(inputId.value.trim().length === 0){
    inputId.nextElementSibling.nextElementSibling.style.color = "black";
  }


  if(val.length === 0){ 
    span.innerText = "영문자 대/소문자 특수문자, 숫자 포함 8 ~ 32자";
    span.style.color = "black";
    checkList["input-pw"] = false;
    checkPwFn();
    return;
  }


});


inputPw.addEventListener("input", e =>{

  const val = inputPw.value.trim();
  const span = e.target.nextElementSibling.nextElementSibling;
  inputPw.value = val;

  const regEx = /^[A-Za-z\d\!\@\#\$\%\^\&\*]{8,32}$/;

  if(regEx.test(val)){ // 유효한 경우
    span.innerText = "유효한 비밀번호 형식입니다"
    span.style.color = "green";
    checkList["input-pw"] = true;
  }
  else{
    span.innerText = "비밀번호가 유효하지 않습니다"
    span.style.color = "red";
    checkList["input-pw"] = false;
  }

  checkPwFn();


})


/* 비밀번호 확인*/
inputPwCheck.addEventListener("click", e => {

  const span = e.target.nextElementSibling.nextElementSibling;
  

  if(inputPw.value.trim().length === 0){
    span.innerText = "비밀번호를 먼저 입력해주세요";
    span.style.color = "black";
    checkList["input-pw-check"] = false;

    return;
  }

});

inputPwCheck.addEventListener("input", e =>{

  const span = e.target.nextElementSibling.nextElementSibling;

  const val = e.target.value.trim();
  e.target.value = val;
  const pwVal = inputPw.value;



  if(val == pwVal){
    span.innerText = "비밀번호 일치";
    span.style.color = "green";
    checkList["input-pw-check"] = true;
  }
  else{
    span.innerText = "비밀번호 불일치";
    span.style.color="red";
    checkList["input-pw-check"] = false;
  }

})


function checkPwFn(){
  const span = inputPwCheck.nextElementSibling.nextElementSibling;

  const pwVal = inputPw.value.trim();
  const checkVal = inputPwCheck.value.trim();

  if(pwVal.length == 0 || checkVal.length==0){ 

    return;
  }


  if(pwVal == checkVal){
    span.innerText = "비밀번호 일치";
    span.style.color = "green";
  }
  else{
    span.innerText = "비밀번호 불일치";
    span.style.color="red";
  }

}



/* 이메일 */

inputEmail.addEventListener("click", e => {
  
  if(inputId.value.trim().length === 0){
    inputId.nextElementSibling.nextElementSibling.style.color = "black";
  }

  if(inputPw.value.trim().length === 0){
    inputPw.nextElementSibling.nextElementSibling.style.color = "black";
    inputPw.nextElementSibling.nextElementSibling.innerText = "*필수 입력 항목입니다"; 

  }

  if(inputPwCheck.value.trim().length === 0){
    inputPwCheck.nextElementSibling.nextElementSibling.style.color = "black";
  }
});



/* 주소 */

inputAddress.addEventListener("click", e => {
  
  if(inputId.value.trim().length === 0){
    inputId.nextElementSibling.nextElementSibling.style.color = "black";
  }

  if(inputPw.value.trim().length === 0){
    inputPw.nextElementSibling.nextElementSibling.style.color = "black";
    inputPw.nextElementSibling.nextElementSibling.innerText = "*필수 입력 항목입니다"; 

  }

  if(inputPwCheck.value.trim().length === 0){
    inputPwCheck.nextElementSibling.nextElementSibling.style.color = "black";
  }

});



/* 제출 */
signupForm.addEventListener('submit', e => {


  if(inputPwCheck.value.trim().length === 0){
    inputPwCheck.nextElementSibling.nextElementSibling.style.color = "black";
    e.preventDefault();
    inputEmail.focus();
  }
  
  if(inputPw.value.trim().length === 0){
    inputPw.nextElementSibling.nextElementSibling.style.color = "black";
    inputPw.nextElementSibling.nextElementSibling.innerText = "*필수 입력 항목입니다"; 
    e.preventDefault();
    inputPw.focus();
    
  }
  if(inputId.value.trim().length === 0){
    inputId.nextElementSibling.nextElementSibling.style.color = "black";
    e.preventDefault();
    inputId.focus();
  }
  
  for(let key in checkList){

    if(!checkList[key]){ 
      let str;
      switch(key){
        case "input-pw" : str = "비밀번호가 "; break;
        case "input-pw-check" : str = "비밀번호 확인이 "; break;
      }

      e.preventDefault(); 

      document.getElementById(key).focus();
      return;
    }
  }
});