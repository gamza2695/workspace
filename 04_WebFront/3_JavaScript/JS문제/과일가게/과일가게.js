const apple = document.getElementById("apple");
const banana = document.getElementById("banana");
const melon = document.getElementById("melon");

const appleNum = document.getElementById("apple-num");
const bananaNum = document.getElementById("banana-num");
const melonNum = document.getElementById("melon-num");

const countBtn = document.getElementById("count-btn");
const result = document.getElementById("result");

countBtn.addEventListener("click",() => {

  const selectedItems = document.querySelectorAll("input[name='fruits']:checked");
  let sum = 0;

  for(let i = 0; i <selectedItems.length; i++){

    if(selectedItems[i].value=='apple'){
      result.innerText += ' 사과 ' + appleNum.value + '개 ';
      sum += 2000 * appleNum.value;
    }

    if(selectedItems[i].value=='banana'){
      result.innerText += ' 바나나 ' + bananaNum.value + '개 ';
      sum += 3000 * bananaNum.value;
    }

    if(selectedItems[i].value=='melon'){
      result.innerText += ' 메론 ' + melonNum.value + '개 ';
      sum += 5000 * melonNum.value;
    }

  }

  result.innerText += ' 총합 ' + sum + '원';

})
