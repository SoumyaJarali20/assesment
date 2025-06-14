// Function to count vowels in a string (case-insensitive)
const countVowels = (str) => {
  const vowels = ['a', 'e', 'i', 'o', 'u'];
  let count = 0;

  for (let char of str.toLowerCase()) {
    if (vowels.includes(char)) {
      count++;
    }
  }

  return count;
};

// Example:
console.log(countVowels("Hello World")); // Output: 3
