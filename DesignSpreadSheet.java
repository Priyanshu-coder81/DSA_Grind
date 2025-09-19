class Spreadsheet {
    HashMap<String, Integer> hmap;

    public Spreadsheet(int rows) {
        hmap = new HashMap<>();
    }

    //
    public void setCell(String cell, int value) {
        hmap.put(cell, value);
    }

    // delte from map
    public void resetCell(String cell) {
        hmap.remove(cell);

    }

    public int getValue(String formula) {
        
        formula = formula.substring(1);

        String[] st = formula.split("\\+");
        int num = 0;
        for(String p : st) {
            if(Character.isLetter(p.charAt(0))) {
                num += hmap.getOrDefault(p,0);
            }
            else {
                num += Integer.parseInt(p);
            }
        }
        return num;
}}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */