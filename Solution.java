import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {
    public static <Input,Output> List<List<Output>> gridMap(Function<Input,Output> fn, List<List<Input>> matrix){
      return matrix.stream().map(row -> row.stream().map(fn).collect(Collectors.toList())).collect(Collectors.toList());
    }

    public static <Input,Output> List<Output> simpleMap(Function<Input,Output> fn, List<Input> row){
      return row.stream().map(fn).collect(Collectors.toList());
    }
}

