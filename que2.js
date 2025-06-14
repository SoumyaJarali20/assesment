// Function to flatten a nested array and return sorted unique values
const flattenAndSort = (nestedArray) => {
  // Flatten the array using flat() and remove duplicates using Set
  const flatArray = [...new Set(nestedArray.flat())];

  // Sort the array in ascending order
  return flatArray.sort((a, b) => a - b);
};

// Example:
console.log(flattenAndSort([[3, 2, 1], [4, 5, 2], [1, 6]])); 
// Output: [1, 2, 3, 4, 5, 6]
