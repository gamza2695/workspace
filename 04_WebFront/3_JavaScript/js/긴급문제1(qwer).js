const key4 = document.getElementsByClassName("keyboard");

document.addEventListener("keydown",function(e){
  switch(e.key){
    case  "q" : key4[0].style.backgroundColor = "skyblue"; break;
    case  "w" : key4[1].style.backgroundColor = "lightpink"; break;
    case  "e" : key4[2].style.backgroundColor = "yellow"; break;
    case  "r" : key4[3].style.backgroundColor = "tomato"; break;
  }
})

document.addEventListener("keyup",function(e){
  switch(e.key){
    case  "q" : key4[0].style.backgroundColor = "white"; break;
    case  "w" : key4[1].style.backgroundColor = "white"; break;
    case  "e" : key4[2].style.backgroundColor = "white"; break;
    case  "r" : key4[3].style.backgroundColor = "white"; break;
  }
})


// answer
const keys = document.getElementsByClassName("keyboard");

// 문서 내에서 키다운 이벤트가 발생했을 때
document.addEventListener("keydown", function(e){
  let index = 0;

  // e.key : 입력한 키
  // 문자열.toLowerCase() : 소문자로
  switch(e.key.toLowerCase()){
  case 'q': index = 0; break;
  case 'w': index = 1; break;
  case 'e': index = 2; break;
  case 'r': index = 3; break;
  default: return;
  }

  key4[index].style.backgroundColor = "skyblue";
})

document.addEventListener("keyup", function(e){

  let index = 0;

  switch(e.key.toLowerCase()){
  case 'q': index = 0; break;
  case 'w': index = 1; break;
  case 'e': index = 2; break;
  case 'r': index = 3; break;
  }

  key4[index].style.backgroundColor = "white";
})
