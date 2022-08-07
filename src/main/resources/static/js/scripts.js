document.getElementById("generate-btn").addEventListener("click", () => {
	randomKey();
});

const clearTable = () => {
	document.querySelectorAll('div.marked-number').forEach(el => el.classList.remove('marked-number'));
	document.querySelectorAll('div.marked-star').forEach(el => el.classList.remove('marked-star'));
}

function generateRandomNumbers(resultArr, totalNumbersArr, cells, totalNumbersToGenerate, cssClass) {
	while (resultArr.length !== totalNumbersToGenerate) {
		const randNum = Math.ceil(Math.random() * cells);
		if (resultArr.includes(randNum)) {
			continue;
		}
		resultArr.push(randNum);
	}
	for (let i = 0; i < totalNumbersArr.length; i++) {
		if (resultArr.includes(parseInt(totalNumbersArr[i].innerText))) {
			totalNumbersArr[i].className = cssClass;
		}
	}
}

const randomKey = () => {
	clearTable();
	let numeros = [];
	let estrelas = [];
	generateRandomNumbers(
		numeros,
		document.getElementById("numeros").children,
		50,
		5,
		'marked-number')
	generateRandomNumbers(
		estrelas,
		document.getElementById("estrelas").children, 12,
		2,
		'marked-star')
}