/* =========================================== */
/* 기안문 정보 받아오기 */

(()=>{

  // 기안문 정보 가져오기
  fetch("/approval/writeApproval/docWriteInfos")
  .then((resp) => {
    // console.log(resp);
    return resp.json();
  })
  .then((map) => {

    // console.log(map);
    const docWriteInfosMap = new Map(Object.entries(map));


    // 팀이름
    const infoTeams = document.querySelectorAll(".infoTeam");
    infoTeams.forEach((infoTeam)=>{
      infoTeam.innerText = docWriteInfosMap.get('infoTeam');
    })

    // 이름
    const infoNames = document.querySelectorAll(".infoName");
    // console.log(infoNames);
    // console.log(docWriteInfosMap.get('infoName'));
    infoNames.forEach((infoName)=>{
      infoName.innerText = docWriteInfosMap.get('infoName');
    })

    const docWriteInfos = document.querySelectorAll(".docWriteInfo");
    docWriteInfos.forEach((docWriteInfo)=>{
      docWriteInfo.innerText = docWriteInfosMap.get('infoName') + "(" + docWriteInfosMap.get('infoTeam') + ")";
    })

  })
  .catch(e => console.log(e));

})();



/* =========================================================== */

// 임시저장 confirm 
const saveDoc = document.querySelectorAll('#saveHoliday, #saveRetirement, #saveStore, #saveExpense, #saveOrder');

saveDoc.forEach((doc)=>{
  doc.addEventListener("click",e=>{    
    const userConfirm = confirm("작성한 문서를 임시저장하시겠습니까?");

    if(!userConfirm){
      e.preventDefault();
      return;
    }
  })
})


/* =========================================================== */
const openDocOne = document.getElementById("docOne") // 휴가
const openDocTwo = document.getElementById("docTwo") // 퇴직
const openDocThree = document.getElementById("docThree") // 점포
const openDocFour = document.getElementById("docFour") // 지출
const openDocFive = document.getElementById("docFive") // 발주


// 모달 창 띄울 때 주소 넣기
// 모달 창 다시 켰을 때 reset하기
// 주소 굳이 넣어야..? => 나중에 삭제
openDocOne.addEventListener("click",()=>{
  history.pushState(null, null, 'writeApproval/docHoliday');
  inputHoliday.value="";
  inputHoliday2.value="";
  docHolidayStart.value="";
  docHolidayEnd.value="";
  docHolidayText.value="";
  updateTextCount();
})
openDocTwo.addEventListener("click",()=>{
  history.pushState(null, null, 'writeApproval/docRetirement');
  inputRetire.value="";
  inputRetire2.value="";
  retirementDate.value="";
  docRetirementText.value="";
})
openDocThree.addEventListener("click",()=>{
  history.pushState(null, null, 'writeApproval/docStore');
  inputStore.value="";
  inputStore2.value="";
  storeName.value="";
  openStore.checked=false;
  closeStore.checked=false;
  docStoreText.value="";

})
openDocFour.addEventListener("click",()=>{
  history.pushState(null, null, 'writeApproval/docExpense');
  inputExpense.value="";
  inputExpense2.value="";
  docExpenseText.value="";
  // 파일도 추가
})
openDocFive.addEventListener("click",()=>{
  history.pushState(null, null, 'writeApproval/docOrder');
})


/* 닫기 -> 주소 복원 */
// 닫기 버튼 클릭 
const closeDocs = document.querySelectorAll('button[name="closeDoc"]');

closeDocs.forEach(closeDoc=>{
  closeDoc.addEventListener("click",e=>{
    history.pushState(null, null, '/approval/writeApproval');
  })
})


/* =========================================================== */
/* 휴가 신청서 */
const submitHoliday = document.getElementById("submitHoliday");
const saveHoliday = document.getElementById("saveHoliday");
const inputHoliday = document.getElementById("inputHoliday");
const inputHoliday2 = document.getElementById("inputHoliday2");
const docHolidayStart = document.getElementById("docHolidayStart");
const docHolidayEnd = document.getElementById("docHolidayEnd");
const docHolidayText = document.getElementById("docHolidayText");

// 제목 입력 시 -> 템플릿 안 제목 같이 입력되기
inputHoliday.addEventListener("input",e=>{
  const val = inputHoliday.value.trim();
  inputHoliday2.value = val;
})

// 내용 글자수 표시
const textCountHoliday = document.getElementById("textCountHoliday");
const maxLength = 1000;

function updateTextCount() {
  let currentLength = docHolidayText.value.length;
  textCountHoliday.textContent = currentLength + ' / ' + maxLength + ' 글자';

  if (currentLength > maxLength) {
    textCountHoliday.style.color = 'red';
  } else {
    textCountHoliday.style.color = 'black';
  }
}

docHolidayText.addEventListener('input',e=>{
  updateTextCount();
})


// 결재 버튼 클릭
submitHoliday.addEventListener("click", e =>{


  // 제목
  if(inputHoliday.value.trim().length == 0){
    alert("제목을 입력해주세요");
    inputHoliday.focus();
    e.preventDefault();
    return;
  }

  if(inputHoliday2.value.trim().length == 0){
    alert("제목을 입력해주세요");
    inputHoliday2.focus();
    e.preventDefault();
    return;
  }

  // 날짜
  if(docHolidayStart.value===''){
    alert("휴가 시작일을 입력해주세요");
    docHolidayStart.focus();
    e.preventDefault();
    return;
  }
  if(docHolidayEnd.value===''){
    alert("휴가 종료일을 입력해주세요");
    docHolidayEnd.focus();
    e.preventDefault();
    return;
  }
  if(docHolidayStart.value>docHolidayEnd.value){ // 휴가 종료일이 시작일보다 앞일때
    alert("휴가 종료일을 정확하게 입력해주세요")
    docHolidayEnd.focus();
    e.preventDefault();
    return;
  }

  // 내용
  if(docHolidayText.value===''){
    alert("내용을 입력해주세요");
    docHolidayText.focus();
    e.preventDefault();
    return;
  }

  const userConfirm = confirm("결재를 요청하시겠습니까?");

  if(!userConfirm){
    e.preventDefault();
    return;
  }
})

/* =========================================================== */
/* 사직서  */
const submitRetirement = document.getElementById("submitRetirement");
const saveRetirement = document.getElementById("saveRetirement");
const inputRetire = document.getElementById("inputRetire");
const inputRetire2 = document.getElementById("inputRetire2");
const retirementDate = document.getElementById("retirementDate");
const docRetirementText = document.getElementById("docRetirementText")

inputRetire.addEventListener("input",e=>{
  const val = inputRetire.value;
  inputRetire2.value = val;
})


// 결재 버튼 클릭
submitRetirement.addEventListener("click", e =>{
  
  // 제목
  if(inputRetire.value.trim().length == 0){
    alert("제목을 입력해주세요");
    inputRetire.focus();
    e.preventDefault();
    return;
  }

  if(inputRetire2.value.trim().length == 0){
    alert("제목을 입력해주세요");
    inputRetire2.focus();
    e.preventDefault();
    return;
  }

  // 날짜
  if(retirementDate.value===''){
    alert("퇴직 예정일을 입력해주세요");
    retirementDate.focus();
    e.preventDefault();
    return;
  }

  // 내용
  if(docRetirementText.value===''){
    alert("내용을 입력해주세요");
    docRetirementText.focus();
    e.preventDefault();
    return;
  }

  const userConfirm = confirm("결재를 요청하시겠습니까?");

  if(!userConfirm){
    e.preventDefault();
    return;
  }

})

/* =========================================================== */
/* 출/폐점 등록 요청서 */
const submitStore = document.getElementById("submitStore");
const saveStore = document.getElementById("saveStore");
const inputStore = document.getElementById("inputStore");
const inputStore2 = document.getElementById("inputStore2");
const storeName = document.getElementById("storeName");
const openStore = document.getElementById("openStore");
const closeStore = document.getElementById("closeStore");
const docStoreText = document.getElementById("docStoreText");

inputStore.addEventListener("input",e=>{
  const val = inputStore.value;
  inputStore2.value = val;
})

// 결재 버튼 클릭
submitStore.addEventListener("click", e =>{
  // 제목
  if(inputStore.value.trim().length == 0){
    alert("제목을 입력해주세요");
    inputStore.focus();
    e.preventDefault();
    return;
  }

  if(inputStore2.value.trim().length == 0){
    alert("제목을 입력해주세요");
    inputStore2.focus();
    e.preventDefault();
    return;
  }

  // storeName = storeName.value.trim();
  if(storeName.length == 0){
    alert("매장명을 입력해주세요");
    storeName.focus();
    e.preventDefault();
    return;
  }

  if(!(openStore.checked) && !(closeStore.checked)){
    alert("출/폐점 여부를 체크해주세요");
    e.preventDefault();
    return;
  }

  if(docStoreText.value===''){
    alert("내용을 입력해주세요");
    docStoreText.focus();
    e.preventDefault();
    return;
  }

  const userConfirm = confirm("결재를 요청하시겠습니까?");

  if(!userConfirm){
    e.preventDefault();
    return;
  }  

})

/* =========================================================== */
/* 지출결의서 */
const submitExpense = document.getElementById("submitExpense");
const saveExpense = document.getElementById("saveExpense");
const inputExpense = document.getElementById("inputExpense");
const inputExpense2 = document.getElementById("inputExpense2");
const docExpenseText = document.getElementById("docExpenseText");
// 첨부파일 추가

inputExpense.addEventListener("input",e=>{
  const val = inputExpense.value;
  inputExpense2.value = val;
})

// 결재 버튼 클릭
submitExpense.addEventListener("click", e =>{
  // 제목
  if(inputExpense.value.trim().length == 0){
    alert("제목을 입력해주세요");
    inputExpense.focus();
    e.preventDefault();
    return;
  }

  if(inputExpense2.value.trim().length == 0){
    alert("제목을 입력해주세요");
    inputExpense2.focus();
    e.preventDefault();
    return;
  }

  if(docExpenseText.value===''){
    alert("내용을 입력해주세요");
    docExpenseText.focus();
    e.preventDefault();
    return;
  }


  // 첨부파일 유효성 검사 추가

  const userConfirm = confirm("결재를 요청하시겠습니까?");

  if(!userConfirm){
    e.preventDefault();
    return;
  }  

})

/* =========================================================== */
/* 발주기안서 */
const submitOrder = document.getElementById("submitOrder");
const saveOrder = document.getElementById("saveOrder");
const inputOrder = document.getElementById("inputOrder");
const inputOrder2 = document.getElementById("inputOrder2");
const orderDate = document.getElementById("orderDate");
//품목 리스트 추가


inputOrder.addEventListener("input",e=>{
  const val = inputOrder.value;
  inputOrder2.value = val;
})

// 결재 버튼 클릭
submitOrder.addEventListener("click", e =>{
  
  // 제목
  if(inputOrder.value.trim().length == 0){
    alert("제목을 입력해주세요");
    inputOrder.focus();
    e.preventDefault();
    return;
  }

  if(inputOrder2.value.trim().length == 0){
    alert("제목을 입력해주세요");
    inputOrder2.focus();
    e.preventDefault();
    return;
  }

  // 날짜
  if(orderDate.value===''){
    alert("납기일을 입력해주세요");
    orderDate.focus();
    e.preventDefault();
    return;
  }

  // 품목리스트 추가예정

  const userConfirm = confirm("결재를 요청하시겠습니까?");

  if(!userConfirm){
    e.preventDefault();
    return;
  }

})

/* =========================================================== */
/* 부서선택 - 팀 선택 - 결재자 선택 */
const selectDepartment = document.getElementById("selectDepartment");
const selectTeam = document.getElementById("selectTeam");
const selectApprover = document.getElementById("selectApprover");


selectDepartment.addEventListener("change",()=>{

  const depart0 = ["임원팀"];
  const depart1 = ["사원관리팀","점주관리팀","점포관리팀"];
  const depart2 = ["재고관리팀","매출관리팀","회계팀","영업팀"];
  const depart3 = ["전산팀","행정팀"];
  const depart4 = ["고객서비스팀"];

  let selectD;

  console.log(selectDepartment.value);

  if(selectDepartment.value=="0") {selectD = depart0;}
  else if(selectDepartment.value=="1"){selectD = depart1;}
  else if(selectDepartment.value=="2"){selectD = depart2;}
  else if(selectDepartment.value=="3"){selectD = depart3;}
  else if(selectDepartment.value=="4"){selectD = depart4;}

  selectTeam.innerHTML="";
  const option = document.createElement("option");
  option.innerText ="--팀 선택--";
  selectTeam.append(option);

  for(let team in selectD){
    const option = document.createElement("option");
    option.value = selectD[team];
    console.log(option.value);
    option.innerText= selectD[team];
    selectTeam.append(option);
  }

  selectApprover.innerHTML="";
  const option2 = document.createElement("option");
  option2.innerText ="--결재자 선택--";
  option2.setAttribute("value", "0");
  selectApprover.append(option2);

  if(selectTeam.value!=0){
    fetch("/approval/writeApproval/selectApprover?selectDepartment=" + selectDepartment.value)
    .then(resp=>resp.json())
    .then((list)=>{
      if(list.length!=0){
        for(let approver of list){
          const option3 = document.createElement("option");
          option3.innerText=approver;
          selectApprover.append(option3);
        }
      }
    })
  
    .catch(e=>console.log(e));
  }

});


selectTeam.addEventListener("change",()=>{

  selectApprover.innerHTML="";
  const option = document.createElement("option");
  option.innerText ="--결재자 선택--";
  option.setAttribute("value", "0");
  selectApprover.append(option);

  if(selectTeam.value!=0){
    fetch("/approval/writeApproval/selectApprover2?selectTeam=" + selectTeam.value)
    .then(resp=>resp.json())
    .then((list)=>{
      if(list.length!=0){
        for(let approver of list){
          const option = document.createElement("option");
          option.innerText=approver;
          selectApprover.append(option);
        }
      }
    })
  
    .catch(e=>console.log(e));
  }

})