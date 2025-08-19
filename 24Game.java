class Solution {
    final double eps = 1e-6;

    public boolean solve(ArrayList<Double> arr) {
        int n = arr.size();

        if(n == 1) {
            return (Math.abs(arr.get(0) - 24.0) <= eps);
        }
        for(int i = 0; i<n; i++) {
            for(int j = i; j<n; j++) {
                if(i==j) continue;

                ArrayList<Double> temp = new ArrayList<>();
                for(int k = 0; k<n; k++) {
                    if(k != i && k != j) {
                        temp.add(arr.get(k));
                    }
                }
                double a = arr.get(i);
                double b = arr.get(j);

                ArrayList<Double> possibleValues = new ArrayList<>(List.of(a+b,a-b,b-a,a*b));

                if(Math.abs(a)>0.0) {
                    possibleValues.add(b/a);
                }
                if(Math.abs(b)>0.0) {
                    possibleValues.add(a/b);
                }

                for(Double val : possibleValues) {
                    temp.add(val);
                    if(solve(temp)) return true;
                    temp.remove(val);
                }
            }
        }
        return false;
    }

    public boolean judgePoint24(int[] cards) {
        int n = cards.length;
        ArrayList<Double> arr = new ArrayList<>();

        for(int card : cards) {
            arr.add(1.0*card);
        }

        return solve(arr);
    }
}