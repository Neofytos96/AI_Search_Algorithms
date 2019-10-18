/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import java.util.*;

/**
 *
 * @author steven
 */
public class uniformCostNode extends Node implements Comparable<uniformCostNode>{

    public uniformCostNode(State st, Node previousNode, Action lastAction) {
        super(st,previousNode,lastAction);
    }

    public int compareTo(uniformCostNode n){
        int score = cost;
        int scoreN = n.cost;

        return score - scoreN;
    }

}
