'use strict';

const getEle = (eleNm) => {
	const ele = document.querySelector(eleNm);
	return ele;
}

const crtEle = (eleNm) => {
	const ele = document.createElement(eleNm);
	return ele;
}

const goLoginPage = () => {
	const a = crtEle('a');
	
	a.href = '/com/login';
	a.target = '_self';
	a.click();
}

const goJoinPage = () => {
	const a = crtEle('a');
	
	a.href = '/user/goUser';
	a.target = '_self';
	a.click();
}

const loginPageBtn = getEle('#loginPageBtn');
const joinPageBtn = getEle('#joinPageBtn');

loginPageBtn.addEventListener('click', goLoginPage);
joinPageBtn.addEventListener('click', goJoinPage);