package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private ArrayList<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape){
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (figures.contains(shape)){
            figures.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        return figures.get(n);
    }

    public void showFigures(){
        for(int i=0; i<figures.size(); i++){
            System.out.println(figures.get(i).getShapeName());
        }
    }

    public List<Shape> getFigures(){
        return figures;
    }
}
