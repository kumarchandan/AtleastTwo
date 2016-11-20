// Given an array containing both negative and positive integers. Find the contiguous sub-array with maximum sum.

// Bruteforce
function maxSum(arr) {
	var res = [];
	for (var i = 0; i < arr.length; i++) {
		var max = 0
		var sum = arr[i]
		for (var j = i + 1; j < arr.length; j++) {
			sum = sum + arr[j]
			if (sum > max) {
				max = sum
			}
		}
		res.push({
			index : i,
			max : max
		})
	}
	return res
}

// Kadanes' Algorithm
function kadaneSum(arr) {
	//
	var max_ending_here = 0
	var max_so_far = 0

	for (var i = 0; i < arr.length; i++) {
		max_ending_here = max_ending_here + arr[i]
		if (max_ending_here < 0) {
			max_ending_here = 0
		}
		if (max_ending_here > max_so_far) {
			max_so_far = max_ending_here
		}
	}

	return max_so_far
}