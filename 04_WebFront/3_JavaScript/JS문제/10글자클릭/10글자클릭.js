// const clickNum = document.getElementById("click-num")
// const reset = document.getElementById("reset-btn")

// document.getElementById("1").addEventListener("click", () =>{
//   if(clickNum.innerText.length>10) return;
//   clickNum.innerText += '1';
// })
// document.getElementById("2").addEventListener("click", () =>{ if(clickNum.innerText.length>10) return; clickNum.innerText += '2';})
// document.getElementById("3").addEventListener("click", () =>{ if(clickNum.innerText.length>10) return; clickNum.innerText += '3';})
// document.getElementById("4").addEventListener("click", () =>{ if(clickNum.innerText.length>10) return; clickNum.innerText += '4';})
// document.getElementById("5").addEventListener("click", () =>{ if(clickNum.innerText.length>10) return; clickNum.innerText += '5';})
// document.getElementById("6").addEventListener("click", () =>{ if(clickNum.innerText.length>10) return; clickNum.innerText += '6';})
// document.getElementById("7").addEventListener("click", () =>{ if(clickNum.innerText.length>10) return; clickNum.innerText += '7';})
// document.getElementById("8").addEventListener("click", () =>{ if(clickNum.innerText.length>10) return; clickNum.innerText += '8';})
// document.getElementById("9").addEventListener("click", () =>{ if(clickNum.innerText.length>10) return; clickNum.innerText += '9';})
// document.getElementById("0").addEventListener("click", () =>{ if(clickNum.innerText.length>10) return; clickNum.innerText += '0';})

// reset.addEventListener("click",() => {
//   clickNum.innerText = '';
// })

const numberList = document.querySelectorAll(".num");

for(let num of numberList){
  num.addEventListener("click", e=>{
    if(numbers.innerText.length >= 10){
      alert("10글자 이상 안됨");
      return;
    }
    numbers.innerText += num.innerText;
  })

}