public class QuickSort implements Sorter {

    public void sort(Comparable[] data) {
        quickSort(data, 0, data.length - 1);
    }
   /*
   * クイックソート（再帰用）
   * 配列dataの、data[i]からdata[j]を並べ替えます。
   */
    private void quickSort(Comparable[] data, int i, int j) {
        if (i == j) {
            return ;
        }
        int p = pivot(data, i , j);
        if (p != -1) {
            int k = partition(data, i, j, data[p]);
            quickSort(data, i, k-1);
            quickSort(data, k, j);
        }
    }
   /*
   * 軸要素の選択
   * 順に見て、最初に見つかった異なる2つの要素のうち、
   * 大きいほうの番号を返します。
   * 全部同じ要素の場合は -1 を返します。
   */
    private int pivot(Comparable[] data, int i, int j) {
        int k = i + 1;
        while (k <= j && data[i] == data[k]) {
            k++;
        }
        if (k > j) {
            return  -1;
        }
        if (data[i].compareTo(data[k]) >= 0) {
            return i;
        } else {
            return k;
        }
    }
    /*
    * パーティション分割
    * a[i]～a[j]の間で、x を軸として分割します。
    * x より小さい要素は前に、大きい要素はうしろに来ます。
    * 大きい要素の開始番号を返します。
    */
    private int partition(Comparable[] data, int i, int j, Comparable x) {
        int l = i;
        int r = j;

        // 検索が交差するまで繰り返します
        while (l <= r) {
            // 軸要素以上のデータを探します
            while (l <= j && data[l].compareTo(x) < 0) {
                l++;
            }
            while (r >= i && data[r].compareTo(x) >= 0) {
                r--;
            }
            if (l > r) {
                break;
            }
            Comparable t = data[l];
            data[l] = data[r];
            data[r] = t;
            l++;
            r--;
        }
        return l;
    }
}