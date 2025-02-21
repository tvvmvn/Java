package pack00gof.pack00behavioral.example00chainsofresponsibility;

// Handler Interface
public interface SupportHandler {
  
  void handleRequest(Request request);
  void setNextHandler(SupportHandler nextHandler);
}
