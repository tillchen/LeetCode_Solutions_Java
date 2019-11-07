class MinStack {

    List<Integer> list;
    int min;
    List<Integer> minList;

    public MinStack() {
        min = Integer.MAX_VALUE;
        list = new ArrayList<Integer>();
        minList = new ArrayList<Integer>();
        minList.add(min);
    }

    public void push(int x) {
        if (x <= min) {
            min = x;
            minList.add(min);
            System.out.println(min);
        }
        list.add(x);
    }

    public void pop() {
        if (this.top() == min) {
            Collections.sort(minList);
            minList.remove(0);
            min = minList.get(0);
        }
        list.remove(list.size()-1);
    }

    public int top() {
        return list.get(list.size()-1);
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */