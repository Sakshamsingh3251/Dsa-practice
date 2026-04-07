class Solution {
    public double[] convertTemperature(double celsius) {
        double[] answer = new double[2];
        double Kelvin = celsius + 273.15;
        double Fahrenheit = (celsius * 1.80) + 32.00;
        answer[0] = Kelvin;
        answer[1] = Fahrenheit;
        return answer;
    }
}
