// <<<< JS >>>>

// - 같은 클래스 요소를 모두 얻어와 *배열* 로 반환하는 함수 사용

//    1) document.getElementsByClassName("클래스명")
//    2) document.querySelectorAll(".클래스명")


// - 색이 변하는 박스와 
//   색을 입력하는 박스의 개수가 같다!
//   -> 클래스명으로 얻어온 요소가 담긴 배열의 길이가 같을 것이다!
//   -> 같은 인덱스 요소 끼리 붙어있을 것이다?!
//    ex. 박스[0], 입력[0]은 위아래로 붙어있다
//    ex. 박스[1], 입력[1]은 위아래로 붙어있다




function changecolor(){

  const innerbox = document.getElementsByClassName("innerbox");
  const colorArr = document.getElementsByClassName("color");

  for(let i=0; i<innerbox.length; i++){
    innerbox[i].style.backgroundColor = colorArr[i].innerText;
  }

}