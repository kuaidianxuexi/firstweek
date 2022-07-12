import java.util.ArrayList;

public class Solution{

    /**
     * 失物排序方法
     * @param lostArray 待排序的失物数组
     */
    public void sortLost(Lost[] lostArray){
        int hi = lostArray.length-1;
        sort(lostArray, 0, hi);
    }

    private void swap(Lost[] a, int i, int j)
    {
        Lost t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private void sort(Lost[] a, int s, int t)
    {
        int i , j;
        if (s < t)
        {
            i = s;
            j = t + 1;
            while (true)
            {
                do {
                    i++;
                }while(!(a[s].compareTo(a[i]) >= 0 || i == t));
                do {
                    j--;
                }while(!(a[s].compareTo(a[j]) <= 0 || j == s));
                if (i < j){
                    swap(a, i, j);
                }
                else {
                    break;
                }
            }
            swap(a, s, j);
            sort(a, s, j-1);
            sort(a, j+1, t);
        }
    }
    /**
     * 按关键字搜索失物的方法，这里假设按照失物的领取地点进行搜索
     * @param lostArray 失物数组
     * @param keyword 用户输入的关键字
     * @return 返回查找到的失物
     */
    public Lost[] selectByKeyword(Lost[] lostArray,String keyword){
        ArrayList<Lost> foundArray = new ArrayList<>();
        for (Lost a : lostArray)
        {
            if (a.getColSite().contains(keyword))
            {
                foundArray.add(a);
            }
        }
        Lost[] result = new Lost[foundArray.size()];
        for (int i = 0; i < result.length; i++)
        {
            result[i] = foundArray.get(i);
        }
        return result;
    }

}