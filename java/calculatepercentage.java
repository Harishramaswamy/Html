class calculatepercentage {
    public static void main(String[] args)
    {
        int N = 5, total = 0;
        float percentage;
  
    
        int marks[] = { 87,95,78,89,83};
  
        
        for (int i = 0; i < N; i++) {
            total += marks[i];
        }
        System.out.println("Total Marks : " + total);
  
    
        percentage = (total/ (float)N);
        System.out.println( "Total Percentage : " + percentage + "%");
    }
}