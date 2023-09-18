const button = document.querySelector("#btn");
const v = document.querySelector("#view");
// const iv = document.querySelector("#innerView")

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
    v.style.textAlign = hz.value;
    // v.style.verticalAlign = vc.value;
    // lineheight, flex..?
    v.innerText = ms.value;
})



