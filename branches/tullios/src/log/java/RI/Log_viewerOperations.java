package RI;


/**
* RI/Log_viewerOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from src/log/java/log_viewer.idl
* mercoledì 28 ottobre 2009 16.59.02 CET
*/

public interface Log_viewerOperations 
{
  void setEnvironment (String[] Drivers, int segmentsNumber, short RaceLaps);
  void updateLog (short Driver_ID, int Segment, float Speed, boolean box);
  void endRace (short Driver_ID, short reason);
} // interface Log_viewerOperations
