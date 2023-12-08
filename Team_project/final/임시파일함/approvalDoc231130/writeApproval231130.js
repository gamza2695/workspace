
/* ===================================================== */
// 행 클릭시 체크박스 체크 + 다시 클릭 시 선택 해제 + 체크박스 하나만 클릭 가능
// 체크박스만 클릭했을 때 클릭 안됨 해결 예정
const tblBody = document.getElementById("tblBody");
const tblRows = tblBody.querySelectorAll("#tblRow");
const checkboxAll = document.querySelectorAll('input[type="checkbox"]');
var count = 0;


tblRows.forEach(function(row){
  row.addEventListener("click", function (e){
    if(e.target.parentElement.firstElementChild.firstElementChild==null){
      var chkBox = e.target;
    }
    else{
      var chkBox = e.target.parentElement.firstElementChild.firstElementChild;
    }

    // console.log(chkBox);


    if(chkBox.checked){
      chkBox.checked = false;
      count=0;
      console.log(count);
    }
    else{
      chkBox.checked = true;
      count++;
      console.log(count);
    }

    if(count>1){
      // console.log("하나 이상");
      alert("한개의 문서만 선택해주세요");
      chkBox.checked = false;
    }

  })
})


// =====================================================================

// /* 작성 버튼 클릭 시 페이지 요청 */
// const writeBtn = document.getElementById("writeBtn");
// const checkboxAll = document.querySelectorAll('input[type="checkbox"]');
// var checkedDoc;

// writeBtn.addEventListener("click", ()=> {

//   // 선택한 문서값 찾기
//   checkboxAll.forEach(k => {
//     if(k.checked == true){
//       checkedDoc = k;
//       console.log(checkedDoc.value);
//     }
//   })

//   // 선택한 문서가 없는 경우 알림
//   // 디자인 추가?
//   if(checkedDoc==null){
//     alert("문서를 선택해주세요");
//   }

//   // 팝업
//   const url = `/approval/approvalDoc/${checkedDoc.value}`;
//   const name = "팝업"
//   const option = "width = 830, height = 940, top = 70, left = 530, location = no, resizable=no";

//   window.open(url, name, option);
// })


// ===============================================================
const clickModal = document.getElementById("clickModal");
const modal = document.getElementById("exampleModal")
var checkedDoc;

clickModal.addEventListener("click", () =>{


  checkboxAll.forEach(k => {
    if(k.checked == true){
      checkedDoc = k;
      console.log(checkedDoc.value);
    }
  })

  if(checkedDoc==null){
    // $('#exampleModal').modal('hide');
    // alert("문서를 선택해주세요");
    console.log(checkedDoc);
  }


})



