import java.util.ArrayList;

/**
 * Created by Oliver on 26.11.2014.
 */
public class Variable  {


    private String strData = null;
    private Integer intData = null;
    private Double dblData = null;
    private Boolean boolData = null;
    private ArrayList<Variable> arrData = null;

    private VarType type = VarType.NULL;

    public Variable(VarType typ)
    {
        type = typ;
    }

    public Object getData() {
        switch(type)
        {
            case NULL: return new Variable(VarType.NULL);
            case tArray: return arrData;
            case tInt: return intData;
            case tDouble: return dblData;
            case tBoolean: return boolData;
            case tString: return strData;
            default: return new Variable(VarType.NULL);

        }
    }

    public Variable getLength() {
        switch(type)
        {
            case NULL: return new Variable(VarType.NULL);
            case tArray: return new Variable(this.arrData.size());
            case tInt: return new Variable(VarType.NULL);
            case tDouble: return new Variable(VarType.NULL);
            case tBoolean: return new Variable(VarType.NULL);
            case tString: return new Variable(this.strData.length());
            default: return new Variable(VarType.NULL);

        }
    }


    public enum VarType {NULL,tInt, tDouble, tBoolean, tString, tArray, RETURN, BREAK};

    public String getStrData() {
        return strData;
    }

    public void setStrData(String strData) {
        this.strData = strData;
    }

    public Integer getIntData() {
        return intData;
    }

    public void setIntData(Integer intData) {
        this.intData = intData;
    }

    public Double getDblData() {
        return dblData;
    }

    public void setDblData(Double dblData) {
        this.dblData = dblData;
    }

    public Boolean getBoolData() {
        return boolData;
    }

    public void setBoolData(Boolean boolData) {
        this.boolData = boolData;
    }

    public ArrayList<Variable> getArrData() {
        return arrData;
    }

    public void setArrData(ArrayList<Variable> arrData) {
        this.arrData = arrData;
    }


    public VarType getType() {
        return type;
    }

    public void setType(VarType type) {
        this.type = type;
    }

    public Variable add(Variable rh)
    {
        switch(type)
        {
            case NULL: return new Variable(VarType.NULL);
            case tArray: return new Variable(this.arrData.addAll(rh.getArrData()));
            case tInt:{
                if(rh.getType() == VarType.tInt)
                    return new Variable(this.intData + rh.getIntData());
                if ( rh.getType() == VarType.tDouble)
                    return new Variable((this.intData + rh.getDblData().intValue()));
                if (rh.getType() == VarType.tString)
                    return new Variable(this.intData.toString() + rh.getStrData());
                return new Variable(VarType.NULL);
            }
            case tDouble:{
                if(rh.getType() == VarType.tInt)
                    return new Variable(this.dblData + rh.getIntData());
                if ( rh.getType() == VarType.tDouble)
                    return new Variable(this.dblData + rh.getDblData());
                if (rh.getType() == VarType.tString)
                    return new Variable(this.dblData.toString() + rh.getStrData());
                return new Variable(VarType.NULL);
            }
            case tBoolean: return new Variable(VarType.NULL);
            case tString: {
                    return new Variable(this.strData + rh.getData());
            }
            default: return new Variable(VarType.NULL);

        }

    }

    public Variable sub(Variable rh)
    {
        switch(type)
        {
            case NULL: return new Variable(VarType.NULL);
            case tArray: return new Variable(VarType.NULL);
            case tInt:{
                if(rh.getType() == VarType.tInt)
                    return new Variable(this.intData - rh.getIntData());
                if ( rh.getType() == VarType.tDouble)
                    return new Variable((this.intData - rh.getDblData().intValue()));
                return new Variable(VarType.NULL);
            }
            case tDouble:{
                if(rh.getType() == VarType.tInt)
                    return new Variable(this.dblData - rh.getIntData());
                if ( rh.getType() == VarType.tDouble)
                    return new Variable(this.dblData - rh.getDblData());
                return new Variable(VarType.NULL);
            }
            case tBoolean: return new Variable(VarType.NULL);
            case tString: return new Variable(VarType.NULL);
            default: return new Variable(VarType.NULL);

        }
    }

    public Variable GT(Variable rh)
    {
        switch(type)
        {
            case NULL: return new Variable(VarType.NULL);
            case tArray: return new Variable(VarType.NULL);
            case tInt:{
                if(rh.getType() == VarType.tInt)
                    return new Variable(this.intData > rh.getIntData());
                if ( rh.getType() == VarType.tDouble)
                    return new Variable((this.intData > rh.getDblData().intValue()));
                return new Variable(VarType.NULL);
            }
            case tDouble:{
                if(rh.getType() == VarType.tInt)
                    return new Variable(this.dblData > rh.getIntData());
                if ( rh.getType() == VarType.tDouble)
                    return new Variable(this.dblData > rh.getDblData());
                return new Variable(VarType.NULL);
            }
            case tBoolean: return new Variable(VarType.NULL);
            case tString: return new Variable(VarType.NULL);
            default: return new Variable(VarType.NULL);

        }
    }

    public Variable LT(Variable rh)
    {
        switch(type)
        {
            case NULL: return new Variable(VarType.NULL);
            case tArray: return new Variable(VarType.NULL);
            case tInt:{
                if(rh.getType() == VarType.tInt)
                    return new Variable(this.intData < rh.getIntData());
                if ( rh.getType() == VarType.tDouble)
                    return new Variable((this.intData < rh.getDblData().intValue()));
                return new Variable(VarType.NULL);
            }
            case tDouble:{
                if(rh.getType() == VarType.tInt)
                    return new Variable(this.dblData < rh.getIntData());
                if ( rh.getType() == VarType.tDouble)
                    return new Variable(this.dblData < rh.getDblData());
                return new Variable(VarType.NULL);
            }
            case tBoolean: return new Variable(VarType.NULL);
            case tString: return new Variable(VarType.NULL);
            default: return new Variable(VarType.NULL);

        }
    }

    public Variable EQ(Variable rh)
    {
        switch(type)
        {
            case NULL: return new Variable(VarType.NULL);
            case tArray: return new Variable(VarType.NULL);
            case tInt:{
                if(rh.getType() == VarType.tInt)
                    return new Variable(this.intData == rh.getIntData());
                if ( rh.getType() == VarType.tDouble)
                    return new Variable((this.intData == rh.getDblData().intValue()));
                return new Variable(VarType.NULL);
            }
            case tDouble:{
                // Should add casts in this case
                return new Variable(VarType.NULL);
            }
            case tBoolean: return new Variable(VarType.NULL);
            case tString: return new Variable(VarType.NULL);
            default: return new Variable(VarType.NULL);

        }
    }

    public Variable NEQ(Variable rh)
    {
        switch(type)
        {
            case NULL: return new Variable(VarType.NULL);
            case tArray: return new Variable(VarType.NULL);
            case tInt:{
                if(rh.getType() == VarType.tInt)
                    return new Variable(this.intData != rh.getIntData());
                if ( rh.getType() == VarType.tDouble)
                    return new Variable((this.intData != rh.getDblData().intValue()));
                return new Variable(VarType.NULL);
            }
            case tDouble:{
                // Should add casts in this case
                return new Variable(VarType.NULL);
            }
            case tBoolean: return new Variable(VarType.NULL);
            case tString: return new Variable(VarType.NULL);
            default: return new Variable(VarType.NULL);

        }
    }

    public String getTypeString()
    {
        switch(type)
        {
            case NULL: return "NULL";
            case tArray: return "ArrayList<Variable>";
            case tInt: return "Integer";
            case tDouble: return "Double";
            case tBoolean: return "Boolean";
            case tString: return "String";
            case BREAK: return "Break";
            case RETURN: return "Return";
            default: return "ERROR";

        }
    }

    //CLONE is bad design
    /*
    @Override protected Variable clone()
    {
        Variable clone = null;
        try{
            clone = (Variable) super.clone();
        }catch(CloneNotSupportedException e)
        {
            throw new RuntimeException(e); // won't happen
        } return clone;
    }
    */
    //copy constructor is good design
    public Variable(Variable var)
    {
        strData = var.getStrData();
        intData = var.getIntData();
        dblData = var.getDblData();
        boolData = var.getBoolData();
        type = var.getType();

        arrData = new ArrayList<Variable>();
        if(var.getArrData() == null)
            return;

        for(int i = 0; i < var.getArrData().size(); i++)
        {
            arrData.add(new Variable(var.getArrData().get(i)));
        }



    }


    public void copy(Variable var)
    {
        strData = var.getStrData();
        intData = var.getIntData();
        dblData = var.getDblData();
        boolData = var.getBoolData();
        type = var.getType();

        arrData = new ArrayList<Variable>();
        if(var.getArrData() == null)
            return;

        for(int i = 0; i < var.getArrData().size(); i++)
        {
            arrData.add(new Variable(var.getArrData().get(i)));
        }



    }

    @Override
    public String toString() {
        switch(type)
        {
            case NULL: return "NULL";
            case tArray: return arrData.toString();
            case tInt: return intData.toString();
            case tDouble: return dblData.toString();
            case tBoolean: return boolData.toString();
            case tString: return strData.toString();
            default: return "ERROR";

        }
    }



    Variable(String str)
    {
      strData = str;
        type = VarType.tString;

    }

    Variable(Integer iData)
    {
        intData = iData;
        type = VarType.tInt;
    }

    Variable(Double dData)
    {
        dblData = dData;
        type = VarType.tDouble;
    }

    Variable(Boolean bData)
    {
        boolData = bData;
        type = VarType.tBoolean;
    }

    Variable(ArrayList<Variable> aData)
    {
        arrData = (ArrayList<Variable>)aData.clone();
        type = VarType.tInt.tArray;
    }




}
