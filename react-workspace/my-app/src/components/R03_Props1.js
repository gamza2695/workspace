import React from 'react';

// props : 부모 컴포넌트가 자식 컴포넌트에 데이더 전달 시 사용하는 객체
// * props는 자식 컴포넌트에서 수정 불가능 *


/* 컴포넌트 함수명, 변수명은 대문자로 시작 */
const PropsEx1 = (props) =>{

  console.log(props);

  return(
    /* fragment(조각) : 감싸는 용도, 렌더링 시 사라짐 */
    /* 컴포넌트 함수는 하나의 요소만 리턴 가능! */
    <>
      <h3>번호 : {props.num} / 이름 : {props.name}</h3>
    </>
  );
};
// 외부에서 import 시 PropsEx1 함수(컴포넌트)를 기본값으로 내보냄
export default PropsEx1;