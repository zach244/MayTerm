public class NonRecursive extends SortFactory{
    String algoName;

    public NonRecursive(){
      //need to get super class varaible algorithm
        this.algorithm = algoName;
    }

    public SortingAlgorithm getAlgorithm(){
        SortingAlgorithm sortingAlgorithm = null;
        if(algoName.equals("Selection"))
            sortingAlgorithm = new SelectionSort();
        else if(algoName.equals("Insertion"))
            sortingAlgorithm = new InsertionSort();
        return sortingAlgorithm;

    }
}
