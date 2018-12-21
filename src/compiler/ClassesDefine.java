/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

import java.util.ArrayList;

/**
 *
 * @author DeLL
 */
public class ClassesDefine {
      public String Name;
    public String type;
    public String Am;
    public Boolean Static;
    public String Category;
    public String Extends;
    public String Impliment;
    ArrayList<FuncClassAttribute> ClassFunctionAttribute; 
    ArrayList<FuncLocalAttributr> FunctionAttribute; 

    public ClassesDefine(String Name, String type, String Am, Boolean Static, String Category, String Extends, String Impliment, ArrayList<FuncClassAttribute> ClassFunctionAttribute, ArrayList<FuncLocalAttributr> FunctionAttribute) {
        this.Name = Name;
        this.type = type;
        this.Am = Am;
        this.Static = Static;
        this.Category = Category;
        this.Extends = Extends;
        this.Impliment = Impliment;
        this.ClassFunctionAttribute = new ArrayList();
        this.FunctionAttribute = new ArrayList();
    }


    

}
