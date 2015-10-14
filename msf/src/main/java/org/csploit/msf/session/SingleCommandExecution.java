package org.csploit.msf.session;

/**
 * Executes a single command and optionally allows for reading/writing I/O
 * to the new process.
 *
 * footnote: I didn't found any implementors of this interface in the framework
 */
public interface SingleCommandExecution {
  void init(String cmd, String[] args); // TODO: options ??
  String read(int length);
  int write(String data);
  void close();
}