// ArrayAddition.js
// 1) Add two numbers which are given in form of Array.

function ArrayAddition(arr1, arr2) {
	//
	var maxLen = Math.max(arr1.length, arr2.length)
	var arr3 = new Array(maxLen)
	//
	var i = arr1.length - 1
	var j = arr2.length - 1
	var rem = 0
	maxLen -= 1
	//
	while (i >= 0 && j >= 0) {
		var sum = arr1[i] + arr2[j] + rem
		rem = Math.floor(sum / 10)
		arr3[maxLen] = sum % 10

		i -= 1
		j -= 1
		maxLen -= 1
	}
	//
	while (i >= 0) {
		var sum = arr1[i] + rem
		rem = Math.floor(sum / 10)
		arr3[maxLen] = sum % 10

		i -= 1
		maxLen -= 1
	}
	//
	while (j >= 0) {
		var sum = arr1[j] + rem
		rem = Math.floor(sum / 10)
		arr3[maxLen] = sum % 10

		j -= 1
		maxLen -= 1
	}
	//
	if (rem !== 0) {
		var arr4 = new Array(arr3.length + 1)
		for (var k = arr4.length - 1; k > 0; k--) {
			arr4[k] = arr3[k - 1]
		}
		//
		arr4[0] = rem
	}
	//
	if (arr4) {
		return arr4
	} else {
		return arr3
	}
}