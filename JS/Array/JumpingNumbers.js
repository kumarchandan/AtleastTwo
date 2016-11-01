
function jumpingNumbers(num) {
 num = (num).toString().split("").map(function(t){return parseInt(t)})
 for(var i = 1; i < num.length; i++) {
  if(!(num[i] === (num[i-1] + 1) || num[i] === (num[i-1] - 1))) {
   return false
  }
 }
 return true
}