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

