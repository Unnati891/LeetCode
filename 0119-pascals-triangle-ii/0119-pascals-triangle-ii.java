class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>row=new ArrayList<>();
        row.add(1);
        for(int i=1;i<=rowIndex;i++){
            long previous=row.get(row.size()-1);
            long next=previous * (rowIndex-i+1)/i;
            row.add((int)next);
        }
        return row;
    }
}