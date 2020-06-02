class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int c,a=0;
        if(coordinates.length==2)
            return true;
        else{
        int x=coordinates[1][1]-coordinates[0][1];
            int y=coordinates[1][0]-coordinates[0][0];
        for(int i=2;i<coordinates.length;i++){
            if(y*(coordinates[i][1]-coordinates[0][1])!=x*(coordinates[i][0]-coordinates[0][0]))
                return false;
        }
        }
            return true;
        
        
    }
}
