// Function to summarize expenses by category and find the highest
const getCategorySummary = (expenses) => {
  const summary = {};

  // Calculate total for each category
  for (let item of expenses) {
    const { category, amount } = item;
    summary[category] = (summary[category] || 0) + amount;
  }

  // Find the category with the highest total expense
  let highestCategory = '';
  let maxAmount = 0;

  for (let category in summary) {
    if (summary[category] > maxAmount) {
      maxAmount = summary[category];
      highestCategory = category;
    }
  }

  // Add the highest category to the summary
  summary.highestExpense = highestCategory;

  return summary;
};

// Example:
const expenses = [
  { category: "Food", amount: 120 },
  { category: "Travel", amount: 300 },
  { category: "Food", amount: 80 },
  { category: "Bills", amount: 200 },
  { category: "Travel", amount: 100 }
];

console.log(getCategorySummary(expenses));
/*
Output:
{
  Food: 200,
  Travel: 400,
  Bills: 200,
  highestExpense: "Travel"
}
*/
