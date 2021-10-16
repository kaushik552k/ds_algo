class Solution {
public:
    int area(int row,int col,vector<vector<int>>& grid,vector<vector<int>>& seen){
        if(row<0 || row>=grid.size() || col<0 || col>=grid[0].size() || seen[row][col] || grid[row][col]==0)
            return 0;
        
        seen[row][col]=1;
        return (1+area(row+1,col,grid,seen)+area(row-1,col,grid,seen)+area(row,col+1,grid,seen)+area(row,col-1,grid,seen));
    }
    int maxAreaOfIsland(vector<vector<int>>& grid) {
        int max_area = INT_MIN;
        int n = grid.size();
        int m = grid[0].size();
        vector<vector<int>> seen(n,vector<int>(m,0));
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                max_area = max(max_area,area(i,j,grid,seen));
            }
        }
        return max_area;
        
    }
};