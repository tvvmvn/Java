/*
In the UML, aggregation and composition are defined as 
special forms of associations with the intended meaning 
of classifying part-whole-relationships.
*/

class Engine {};

class Car {
  // to have exclusive (or non-shareable) parts.
  public Engine engine;
};
