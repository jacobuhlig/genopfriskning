public class Graes {

    public Graes() {
    }

    public int howManyDaysUntilTheGrassNeedsToBeCut(int currentHeight, int allowedHeight) {

        int count = 0;
        while(currentHeight < allowedHeight) {
            currentHeight += 8;
            count ++;
        }
        return count;
    }
}
