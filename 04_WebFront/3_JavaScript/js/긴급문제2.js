const button = document.querySelector("#btn");
const v = document.querySelector("#view");

const w = document.querySelector("#width");
const h = document.querySelector("#height");
const fs = document.querySelector("#font-size");
const fc = document.querySelector("#font-color")
const bc = document.querySelector("#back-color")
const ms = document.querySelector("#message");


button.addEventListener("click",function(){
    
    const fw = document.querySelector("[name='fw']:checked");
    const hz = document.querySelector("[name='horizon']:checked");
    const vc = document.querySelector("[name='vertical']:checked");

    v.style.width = w.value + "px";
    v.style.height = h.value + "px";
    v.style.fontSize = fs.value +"px";
    v.style.fontWeight = fw.value;
    v.style.color = fc.value;
    v.style.backgroundColor = bc.value;

    // v.style.textAlign = hz.value;
    // v.style.verticalAlign = vc.value;

    // *** display:flex 줘서 정렬하기
    v.style.justifyContent = hz.value;
    v.style.alignItems = vc.value;

    v.innerText = ms.value;

})


// answer
button.addEventListener("click",function(){
    
    const fw = document.querySelector("[name='fw']:checked");
    const hz = document.querySelector("[name='horizon']:checked");
    const vc = document.querySelector("[name='vertical']:checked");

    // 너비를 입력하는 input에 값이 작성되어 있다면
    if(w.value.trim().length !=0){
        v.style.width = w.value + "px";
    }

    if(h.value.trim().length !=0){
        v.style.height = h.value + "px";
    }

    if(fs.value.trim().length !=0){
        v.style.fontSize = fs.value +"px";
    }

    // fw   -> 체크된 게 없으면 null 반환
    //      -> 체크된 게 있으면 null 아님
    if(fw != null){ // 글자 굵기가 체크되었을 때
        v.style.fontWeight = fw.value;
    }

    if(fc.value.trim().length !=0){
        v.style.color = fc.value;
    }

    if(bc.value.trim().length !=0){
        v.style.backgroundColor = bc.value;
    }

    if(hz != null){ 
        v.style.justifyContent = hz.value;
    }

    if(vc != null){ 
        v.style.alignItems = vc.value;
    }

    if(ms.value.trim().length !=0){
        v.innerText = ms.value;
    }



})


