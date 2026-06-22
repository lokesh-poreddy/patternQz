public class RemoveAllOccurrences {
    public boolean removeAllOccurrences(int[] resultStack, int target) {
        int i = 0;
        int j = resultStack.length - 1;
        while (j >= 0 && resultStack[i] == target[j]) {
            i++;
            j--;
        }
        if (j < 0) {
            return true; 
        }
        return false; 
    }

    public static void main(String[] args) {
        RemoveAllOccurrences sol = new RemoveAllOccurrences();
        int[] resultStack = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;
        System.out.println(sol.removeAllOccurrences(resultStack, target));
    }
}
