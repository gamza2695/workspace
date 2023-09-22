const num = document.getElementById("num");
const createBtn = document.getElementById("create-btn");
const calcBtn = document.getElementById("calc-btn")
const inputArea = document.querySelector(".input-area");
const result = document.querySelector(".result");

createBtn.addEventListener("click", () => {

  
  for(let i=0; i<num.value; i++){

    const row = document.createElement("div");
    const input = document.createElement("input");
    input.setAttribute("type", "number");
    input.classList.add("input-number");
    row.append(input);
    inputArea.append(row);
  }


})

calcBtn.addEventListener("click", () => {
  const nums = document.getElementsByClassName("input-number");
  let sum = 0;

  for(let i = 0; i<nums[i].length; i++){
    sum += Number(nums[i].value);
  }
  result.innerText = sum;
})

