package cyber.deckbuilder.map.mapNodes;

import cyber.deckbuilder.map.mapNodes.nodeEvents.NodeEventInterface;

public interface MapNodeInterface {
    int getMapSlice();
    NodeTypes getNodeType();

    void generateEvent();
    NodeEventInterface getEvent();
}
