function findNumbers(inString) {
  var s = inString.split('');
  var number = "";
  var numbers = [];

  for (var i = 0; i < s.length; i++) {
    if (isInt(s[i])) {
      number += s[i];
    } else {
      if (number) {
        numbers.push(parseInt(number));
        number = "";
      }
    }
  }
  if (number) {
    numbers.push(parseInt(number));
  }
  return numbers;
}

function isInt(value) {
  return !isNaN(value) && 
         parseInt(Number(value)) == value && 
         !isNaN(parseInt(value, 10));
}
