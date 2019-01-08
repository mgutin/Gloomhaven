package com.example.mgutin.gloomhaven;

public class AttackAction implements Action {

    int damageModifier;
    int rangeModifier = 0;
    int staticRange = -1;
    int target = 1;
    Status[] statuses = new Status[]{};
    String special;

    public AttackAction(int damageModifier){
        this.damageModifier = damageModifier;
    }

    public Action rangeModifier(int rangeModifier){
        this.rangeModifier = rangeModifier;
        return this;
    }

    public Action staticRange(int staticRange){
        this.staticRange = staticRange;
        return this;
    }

    public Action target(int target){
        this.target = target;
        return this;
    }

    public Action special(String special){
        this.special = special;
        return this;
    }

    public Action Status(Status... statuses){
        this.statuses = statuses;
        return this;
    }


    @Override
    public String getText() {
        String output = "Attack \u2496 ";
        if(damageModifier >= 0){
            output+="+";
        }
        output+=damageModifier;
        if(rangeModifier != 0){
            output+="\nRange \uDFF9";
            if(rangeModifier > 0){
                output+="+";
            }
            output+=rangeModifier;
        }
        if(statuses.length > 0){
            output+="/n";
        }
        for(int i=0;i<statuses.length;i++){
            output+=statuses[i].name + " ";
        }
        if(special == null){
            output+="/n" + special;
        }
        return output;
    }
}
