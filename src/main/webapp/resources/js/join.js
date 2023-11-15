'use strict';

const getEle = (eleNm) => {
	const ele = document.querySelector(eleNm);
	return ele;
}

const crtEle = (eleNm) => {
	const ele = document.createElement(eleNm);
	return ele;
}