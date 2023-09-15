const input1 = document.getElementById("input1");
const input2 = document.getElementById("input2");
const output = document.getElementById("output");


function plusFn(){
  output.innerText = Number(input1.value) + Number(input2.value);
}
function minusFn(){
  output.innerText = Number(input1.value) - Number(input2.value);
}
function mulFn(){
  output.innerText = Number(input1.value) * Number(input2.value);
}
function divFn(){
  output.innerText = Number(input1.value) / Number(input2.value);
}
function modFn(){
  output.innerText = Number(input1.value) % Number(input2.value);
}


// 아래 코드 안되는 이유! function 수행 전에 렌더링 되므로 
// input1, input2 는 이미 0인 상태에서 함수 수행하게 됨

// const input1 = Number(document.getElementById("input1").value);
// const input2 = Number(document.getElementById("input2").value);
// const output = document.getElementById("output");


// function plusFn(){
//   output.innerText = input1 + input2;
// }
// function minusFn(){
//   output.innerText = input1 - input2;
// }
// function mulFn(){
//   output.innerText = input1 * input2;
// }
// function divFn(){
//   output.innerText = input1 / input2;
// }
// function modFn(){
//   output.innerText = input1 % input2;
// }









