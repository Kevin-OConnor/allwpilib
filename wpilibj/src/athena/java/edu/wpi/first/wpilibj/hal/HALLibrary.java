package edu.wpi.first.wpilibj.hal;

// import com.ochafik.lang.jnaerator.runtime.LibraryExtractor;
// import com.ochafik.lang.jnaerator.runtime.MangledFunctionMapper;
// import com.ochafik.lang.jnaerator.runtime.globals.GlobalDouble;
// import com.ochafik.lang.jnaerator.runtime.globals.GlobalInt;
// import com.sun.jna.Callback;
// import com.sun.jna.Library;
// import com.sun.jna.Native;
// import com.sun.jna.NativeLibrary;
// import com.sun.jna.Pointer;
// import com.sun.jna.PointerType;
// import com.sun.jna.ptr.IntByReference;
// import com.sun.jna.ptr.LongByReference;
// import java.nio.IntBuffer;

/**
 * JNA Wrapper for library <b>HAL</b><br>
 * This file was autogenerated by <a
 * href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a
 * href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few
 * opensource projects.</a>.<br>
 * For help, please visit <a
 * href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a
 * href="http://rococoa.dev.java.net/">Rococoa</a>, or <a
 * href="http://jna.dev.java.net/">JNA</a>.
 */
public class HALLibrary /* implements Library */{
  // public static final String JNA_LIBRARY_NAME =
  // LibraryExtractor.getLibraryPath("HALAthenaJava", true, HALLibrary.class);
  // public static final NativeLibrary JNA_NATIVE_LIB =
  // NativeLibrary.getInstance(HALLibrary.JNA_LIBRARY_NAME,
  // MangledFunctionMapper.DEFAULT_OPTIONS);
  static {
    System.loadLibrary("JNIWrappers");
    // Native.register(HALLibrary.class, HALLibrary.JNA_NATIVE_LIB);
  }

  /**
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Digital.h:148</i><br>
   * enum values
   */
  public static interface Mode {
    /**
     * <i>native declaration :
     * AthenaJava\target\native\include\HAL\Digital.h:144</i>
     */
    public static final int kTwoPulse = 0;
    /**
     * <i>native declaration :
     * AthenaJava\target\native\include\HAL\Digital.h:145</i>
     */
    public static final int kSemiperiod = 1;
    /**
     * <i>native declaration :
     * AthenaJava\target\native\include\HAL\Digital.h:146</i>
     */
    public static final int kPulseLength = 2;
    /**
     * <i>native declaration :
     * AthenaJava\target\native\include\HAL\Digital.h:147</i>
     */
    public static final int kExternalDirection = 3;
  };
  /**
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Digital.h:235</i><br>
   * enum values
   */
  public static interface tSPIConstants {
    /**
     * <i>native declaration :
     * AthenaJava\target\native\include\HAL\Digital.h:233</i>
     */
    public static final int kReceiveFIFODepth = 512;
    /**
     * <i>native declaration :
     * AthenaJava\target\native\include\HAL\Digital.h:234</i>
     */
    public static final int kTransmitFIFODepth = 512;
  };
  /**
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Digital.h:241</i><br>
   * enum values
   */
  public static interface tFrameMode {
    /**
     * <i>native declaration :
     * AthenaJava\target\native\include\HAL\Digital.h:237</i>
     */
    public static final int kChipSelect = 0;
    /**
     * <i>native declaration :
     * AthenaJava\target\native\include\HAL\Digital.h:238</i>
     */
    public static final int kPreLatchPulse = 1;
    /**
     * <i>native declaration :
     * AthenaJava\target\native\include\HAL\Digital.h:239</i>
     */
    public static final int kPostLatchPulse = 2;
    /**
     * <i>native declaration :
     * AthenaJava\target\native\include\HAL\Digital.h:240</i>
     */
    public static final int kPreAndPostLatchPulse = 3;
  };

  /** <i>native declaration : AthenaJava\target\native\include\HAL\Errors.h</i> */
  public static final String NULL_PARAMETER_MESSAGE = "A pointer parameter to a method is NULL";
  /** <i>native declaration : AthenaJava\target\native\include\HAL\Errors.h</i> */
  public static final String NO_AVAILABLE_RESOURCES_MESSAGE = "No available resources to allocate";
  /** <i>native declaration : AthenaJava\target\native\include\HAL\Errors.h</i> */
  public static final String INCOMPATIBLE_STATE_MESSAGE =
      "Incompatible State: The operation cannot be completed";
  /** <i>native declaration : AthenaJava\target\native\include\HAL\Errors.h</i> */
  public static final String ANALOG_TRIGGER_PULSE_OUTPUT_ERROR_MESSAGE =
      "Attempted to read AnalogTrigger pulse output.";
  /** <i>native declaration : AthenaJava\target\native\include\HAL\Errors.h</i> */
  public static final int ANALOG_TRIGGER_LIMIT_ORDER_ERROR = -10;
  /** <i>native declaration : AthenaJava\target\native\include\HAL\Errors.h</i> */
  public static final int SPI_READ_NO_DATA = 14;
  /** <i>native declaration : AthenaJava\target\native\include\HAL\Errors.h</i> */
  public static final String VOLTAGE_OUT_OF_RANGE_MESSAGE =
      "Voltage to convert to raw value is out of range [-10; 10]";
  /** <i>native declaration : AthenaJava\target\native\include\HAL\Errors.h</i> */
  public static final String ANALOG_TRIGGER_LIMIT_ORDER_ERROR_MESSAGE =
      "AnalogTrigger limits error.  Lower limit > Upper Limit";
  /** <i>native declaration : AthenaJava\target\native\include\HAL\Errors.h</i> */
  public static final int SPI_WRITE_NO_MOSI = 12;
  /** <i>native declaration : AthenaJava\target\native\include\HAL\Errors.h</i> */
  public static final String PARAMETER_OUT_OF_RANGE_MESSAGE = "A parameter is out of range.";
  /** <i>native declaration : AthenaJava\target\native\include\HAL\Task.h</i> */
  public static final int OK = 0;
  /** <i>native declaration : AthenaJava\target\native\include\HAL\Task.h</i> */
  public static final int ERROR = (-1);
  /** <i>native declaration : AthenaJava\target\native\include\HAL\Errors.h</i> */
  public static final String SAMPLE_RATE_TOO_HIGH_MESSAGE = "Analog module sample rate is too high";
  /** <i>native declaration : AthenaJava\target\native\include\HAL\Errors.h</i> */
  public static final String SPI_WRITE_NO_MOSI_MESSAGE =
      "Cannot write to SPI port with no MOSI output";
  /** <i>native declaration : AthenaJava\target\native\include\HAL\Errors.h</i> */
  public static final int SPI_READ_NO_MISO = 13;
  /** <i>native declaration : AthenaJava\target\native\include\HAL\Errors.h</i> */
  public static final String SPI_READ_NO_DATA_MESSAGE = "No data available to read from SPI";
  /** <i>native declaration : AthenaJava\target\native\include\HAL\Errors.h</i> */
  /** <i>native declaration : AthenaJava\target\native\include\HAL\Errors.h</i> */
  public static final String SPI_READ_NO_MISO_MESSAGE =
      "Cannot read from SPI port with no MISO input";
  /** <i>native declaration : AthenaJava\target\native\include\HAL\Errors.h</i> */
  public static final String LOOP_TIMING_ERROR_MESSAGE =
      "Digital module loop timing is not the expected value";

  /**
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Notifier.h:339</i>
   */
  // public interface initializeNotifier_ProcessQueue_callback extends Callback
  // {
  // void apply(int uint32_t1, Pointer voidPtr1);
  // };
  /**
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Interrupts.h:342</i>
   */
  /**
   * <i>native declaration : AthenaJava\target\native\include\HAL\Task.h:409</i>
   */
  // public interface FUNCPTR extends Callback {
  // int apply(Object... varargs);
  // };
  /**
   * Original signature : <code>bool checkPWMChannel(void*)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Digital.h:84</i>
   */
  // public static native byte checkPWMChannel(Pointer digital_port_pointer);
  /**
   * Original signature : <code>bool checkRelayChannel(void*)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Digital.h:86</i>
   */
  // public static native byte checkRelayChannel(Pointer digital_port_pointer);
  /**
   * Original signature :
   * <code>void* initializeNotifier(initializeNotifier_ProcessQueue_callback*, int32_t*)</code>
   * <br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Notifier.h:334</i><br>
   *$
   * @deprecated use the safer methods
   *             {@link #initializeNotifier(edu.wpi.first.wpilibj.hal.HALLibrary.initializeNotifier_ProcessQueue_callback, java.nio.IntBuffer)}
   *             and
   *             {@link #initializeNotifier(edu.wpi.first.wpilibj.hal.HALLibrary.initializeNotifier_ProcessQueue_callback, com.sun.jna.ptr.IntByReference)}
   *             instead
   */
  // @Deprecated
  // public static native Pointer
  // initializeNotifier(HALLibrary.initializeNotifier_ProcessQueue_callback
  // ProcessQueue, IntByReference status);
  /**
   * Original signature :
   * <code>void* initializeNotifier(initializeNotifier_ProcessQueue_callback*, int32_t*)</code>
   * <br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Notifier.h:334</i>
   */
  // public static native Pointer
  // initializeNotifier(HALLibrary.initializeNotifier_ProcessQueue_callback
  // ProcessQueue, IntBuffer status);
  /**
   * Original signature : <code>void cleanNotifier(void*, int32_t*)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Notifier.h:336</i><br>
   *$
   * @deprecated use the safer methods
   *             {@link #cleanNotifier(com.sun.jna.Pointer, java.nio.IntBuffer)}
   *             and
   *             {@link #cleanNotifier(com.sun.jna.Pointer, com.sun.jna.ptr.IntByReference)}
   *             instead
   */
  // @Deprecated
  // public static native void cleanNotifier(Pointer notifier_pointer,
  // IntByReference status);
  /**
   * Original signature : <code>void cleanNotifier(void*, int32_t*)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Notifier.h:336</i>
   */
  // public static native void cleanNotifier(Pointer notifier_pointer, IntBuffer
  // status);
  /**
   * Original signature :
   * <code>void updateNotifierAlarm(void*, uint32_t, int32_t*)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Notifier.h:338</i><br>
   *$
   * @deprecated use the safer methods
   *             {@link #updateNotifierAlarm(com.sun.jna.Pointer, int, java.nio.IntBuffer)}
   *             and
   *             {@link #updateNotifierAlarm(com.sun.jna.Pointer, int, com.sun.jna.ptr.IntByReference)}
   *             instead
   */
  // @Deprecated
  // public static native void updateNotifierAlarm(Pointer notifier_pointer, int
  // triggerTime, IntByReference status);
  /**
   * Original signature :
   * <code>void updateNotifierAlarm(void*, uint32_t, int32_t*)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Notifier.h:338</i>
   */
  // public static native void updateNotifierAlarm(Pointer notifier_pointer, int
  // triggerTime, IntBuffer status);
  /**
   * Original signature : <code>void delayTicks(int32_t)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Utilities.h:366</i>
   */
  public static native void delayTicks(int ticks);

  /**
   * Original signature : <code>void delayMillis(double)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Utilities.h:368</i>
   */
  public static native void delayMillis(double ms);

  /**
   * Original signature : <code>void delaySeconds(double)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Utilities.h:370</i>
   */
  public static native void delaySeconds(double s);

  /**
   * Original signature : <code>MUTEX_ID initializeMutex(uint32_t)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Semaphore.h:385</i>
   */
  public static native long initializeMutex(int flags);

  /**
   * Original signature : <code>void deleteMutex(MUTEX_ID)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Semaphore.h:387</i><br>
   *$
   * @deprecated use the safer methods
   *             {@link #deleteMutex(edu.wpi.first.wpilibj.hal.HALLibrary.MUTEX_ID)}
   *             and {@link #deleteMutex(com.sun.jna.Pointer)} instead
   */
  // @Deprecated
  // public static native void deleteMutex(Pointer sem);
  /**
   * Original signature : <code>void deleteMutex(MUTEX_ID)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Semaphore.h:387</i>
   */
  public static native void deleteMutex(long sem);

  /**
   * Original signature : <code>int8_t takeMutex(MUTEX_ID, int32_t)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Semaphore.h:389</i><br>
   *$
   * @deprecated use the safer methods
   *             {@link #takeMutex(edu.wpi.first.wpilibj.hal.HALLibrary.MUTEX_ID, int)}
   *             and {@link #takeMutex(com.sun.jna.Pointer, int)} instead
   */
  // @Deprecated
  // public static native byte takeMutex(Pointer sem, int timeout);
  /**
   * Original signature : <code>int8_t takeMutex(MUTEX_ID, int32_t)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Semaphore.h:389</i>
   */
  public static native byte takeMutex(long sem, int timeout);

  /**
   * Original signature : <code>int8_t giveMutex(MUTEX_ID)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Semaphore.h:391</i><br>
   *$
   * @deprecated use the safer methods
   *             {@link #giveMutex(edu.wpi.first.wpilibj.hal.HALLibrary.MUTEX_ID)}
   *             and {@link #giveMutex(com.sun.jna.Pointer)} instead
   */
  // @Deprecated
  // public static native byte giveMutex(Pointer sem);
  /**
   * Original signature : <code>int8_t giveMutex(MUTEX_ID)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Semaphore.h:391</i>
   */
  // public static native byte giveMutex(HALLibrary.MUTEX_ID sem);
  /**
   * Original signature :
   * <code>SEMAPHORE_ID initializeSemaphore(uint32_t, uint32_t)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Semaphore.h:393</i>
   */
  // public static native HALLibrary.SEMAPHORE_ID initializeSemaphore(int flags,
  // int initial_value);
  /**
   * Original signature : <code>void deleteSemaphore(SEMAPHORE_ID)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Semaphore.h:395</i><br>
   *$
   * @deprecated use the safer methods
   *             {@link #deleteSemaphore(edu.wpi.first.wpilibj.hal.HALLibrary.SEMAPHORE_ID)}
   *             and {@link #deleteSemaphore(com.sun.jna.Pointer)} instead
   */
  // @Deprecated
  // public static native void deleteSemaphore(Pointer sem);
  /**
   * Original signature : <code>void deleteSemaphore(SEMAPHORE_ID)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Semaphore.h:395</i>
   */
  // public static native void deleteSemaphore(HALLibrary.SEMAPHORE_ID sem);
  /**
   * Original signature :
   * <code>int8_t takeSemaphore(SEMAPHORE_ID, int32_t)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Semaphore.h:397</i><br>
   *$
   * @deprecated use the safer methods
   *             {@link #takeSemaphore(edu.wpi.first.wpilibj.hal.HALLibrary.SEMAPHORE_ID, int)}
   *             and {@link #takeSemaphore(com.sun.jna.Pointer, int)} instead
   */
  // @Deprecated
  // public static native byte takeSemaphore(Pointer sem, int timeout);
  /**
   * Original signature :
   * <code>int8_t takeSemaphore(SEMAPHORE_ID, int32_t)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Semaphore.h:397</i>
   */
  // public static native byte takeSemaphore(HALLibrary.SEMAPHORE_ID sem, int
  // timeout);
  /**
   * Original signature : <code>int8_t giveSemaphore(SEMAPHORE_ID)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Semaphore.h:399</i><br>
   *$
   * @deprecated use the safer methods
   *             {@link #giveSemaphore(edu.wpi.first.wpilibj.hal.HALLibrary.SEMAPHORE_ID)}
   *             and {@link #giveSemaphore(com.sun.jna.Pointer)} instead
   */
  // @Deprecated
  // public static native byte giveSemaphore(Pointer sem);
  /**
   * Original signature : <code>int8_t giveSemaphore(SEMAPHORE_ID)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Semaphore.h:399</i>
   */
  // public static native byte giveSemaphore(HALLibrary.SEMAPHORE_ID sem);
  /**
   * Original signature : <code>MULTIWAIT_ID initializeMultiWait()</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Semaphore.h:401</i>
   */
  // public static native HALLibrary.MULTIWAIT_ID initializeMultiWait();
  /**
   * Original signature : <code>void deleteMultiWait(MULTIWAIT_ID)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Semaphore.h:403</i><br>
   *$
   * @deprecated use the safer methods
   *             {@link #deleteMultiWait(edu.wpi.first.wpilibj.hal.HALLibrary.MULTIWAIT_ID)}
   *             and {@link #deleteMultiWait(com.sun.jna.Pointer)} instead
   */
  // @Deprecated
  // public static native void deleteMultiWait(Pointer sem);
  /**
   * Original signature : <code>void deleteMultiWait(MULTIWAIT_ID)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Semaphore.h:403</i>
   */
  // public static native void deleteMultiWait(HALLibrary.MULTIWAIT_ID sem);
  /**
   * Original signature :
   * <code>int8_t takeMultiWait(MULTIWAIT_ID, int32_t)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Semaphore.h:405</i><br>
   *$
   * @deprecated use the safer methods
   *             {@link #takeMultiWait(edu.wpi.first.wpilibj.hal.HALLibrary.MULTIWAIT_ID, int)}
   *             and {@link #takeMultiWait(com.sun.jna.Pointer, int)} instead
   */
  // @Deprecated
  // public static native byte takeMultiWait(Pointer sem, int timeout);
  /**
   * Original signature :
   * <code>int8_t takeMultiWait(MULTIWAIT_ID, int32_t)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Semaphore.h:405</i>
   */
  // public static native byte takeMultiWait(HALLibrary.MULTIWAIT_ID sem, int
  // timeout);
  /**
   * Original signature : <code>int8_t giveMultiWait(MULTIWAIT_ID)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Semaphore.h:407</i><br>
   *$
   * @deprecated use the safer methods
   *             {@link #giveMultiWait(edu.wpi.first.wpilibj.hal.HALLibrary.MULTIWAIT_ID)}
   *             and {@link #giveMultiWait(com.sun.jna.Pointer)} instead
   */
  // @Deprecated
  // public static native byte giveMultiWait(Pointer sem);
  /**
   * Original signature : <code>int8_t giveMultiWait(MULTIWAIT_ID)</code><br>
   * <i>native declaration :
   * AthenaJava\target\native\include\HAL\Semaphore.h:407</i>
   */
  // public static native byte giveMultiWait(HALLibrary.MULTIWAIT_ID sem);
  /**
   * Original signature :
   * <code>TASK spawnTask(char*, int, int, int, FUNCPTR, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t)</code>
   * <br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\Task.h:420</i><br>
   *$
   * @deprecated use the safer methods
   *             {@link #spawnTask(java.nio.ByteBuffer, int, int, int, edu.wpi.first.wpilibj.hal.HALLibrary.FUNCPTR, int, int, int, int, int, int, int, int, int, int)}
   *             and
   *             {@link #spawnTask(com.sun.jna.Pointer, int, int, int, edu.wpi.first.wpilibj.hal.HALLibrary.FUNCPTR, int, int, int, int, int, int, int, int, int, int)}
   *             instead
   */
  // @Deprecated
  // public static native HALLibrary.TASK spawnTask(Pointer name, int priority,
  // int options, int stackSize, HALLibrary.FUNCPTR entryPt, int arg0, int arg1,
  // int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int
  // arg9);
  /**
   * Original signature :
   * <code>TASK spawnTask(char*, int, int, int, FUNCPTR, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t)</code>
   * <br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\Task.h:420</i>
   */
  // public static native HALLibrary.TASK spawnTask(ByteBuffer name, int
  // priority, int options, int stackSize, HALLibrary.FUNCPTR entryPt, int arg0,
  // int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int
  // arg8, int arg9);
  /**
   * Original signature : <code>STATUS restartTask(TASK)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\Task.h:422</i><br>
   *$
   * @deprecated use the safer methods
   *             {@link #restartTask(edu.wpi.first.wpilibj.hal.HALLibrary.TASK)}
   *             and {@link #restartTask(com.sun.jna.Pointer)} instead
   */
  // @Deprecated
  // public static native int restartTask(Pointer task);
  /**
   * Original signature : <code>STATUS restartTask(TASK)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\Task.h:422</i>
   */
  // public static native int restartTask(HALLibrary.TASK task);
  /**
   * Original signature : <code>STATUS deleteTask(TASK)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\Task.h:424</i><br>
   *$
   * @deprecated use the safer methods
   *             {@link #deleteTask(edu.wpi.first.wpilibj.hal.HALLibrary.TASK)}
   *             and {@link #deleteTask(com.sun.jna.Pointer)} instead
   */
  // @Deprecated
  // public static native int deleteTask(Pointer task);
  /**
   * Original signature : <code>STATUS deleteTask(TASK)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\Task.h:424</i>
   */
  // public static native int deleteTask(HALLibrary.TASK task);
  /**
   * Original signature : <code>STATUS isTaskReady(TASK)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\Task.h:426</i><br>
   *$
   * @deprecated use the safer methods
   *             {@link #isTaskReady(edu.wpi.first.wpilibj.hal.HALLibrary.TASK)}
   *             and {@link #isTaskReady(com.sun.jna.Pointer)} instead
   */
  // @Deprecated
  // public static native int isTaskReady(Pointer task);
  /**
   * Original signature : <code>STATUS isTaskReady(TASK)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\Task.h:426</i>
   */
  // public static native int isTaskReady(HALLibrary.TASK task);
  /**
   * Original signature : <code>STATUS isTaskSuspended(TASK)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\Task.h:428</i><br>
   *$
   * @deprecated use the safer methods
   *             {@link #isTaskSuspended(edu.wpi.first.wpilibj.hal.HALLibrary.TASK)}
   *             and {@link #isTaskSuspended(com.sun.jna.Pointer)} instead
   */
  // @Deprecated
  // public static native int isTaskSuspended(Pointer task);
  /**
   * Original signature : <code>STATUS isTaskSuspended(TASK)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\Task.h:428</i>
   */
  // public static native int isTaskSuspended(HALLibrary.TASK task);
  /**
   * Original signature : <code>STATUS suspendTask(TASK)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\Task.h:430</i><br>
   *$
   * @deprecated use the safer methods
   *             {@link #suspendTask(edu.wpi.first.wpilibj.hal.HALLibrary.TASK)}
   *             and {@link #suspendTask(com.sun.jna.Pointer)} instead
   */
  // @Deprecated
  // public static native int suspendTask(Pointer task);
  /**
   * Original signature : <code>STATUS suspendTask(TASK)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\Task.h:430</i>
   */
  // public static native int suspendTask(HALLibrary.TASK task);
  /**
   * Original signature : <code>STATUS resumeTask(TASK)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\Task.h:432</i><br>
   *$
   * @deprecated use the safer methods
   *             {@link #resumeTask(edu.wpi.first.wpilibj.hal.HALLibrary.TASK)}
   *             and {@link #resumeTask(com.sun.jna.Pointer)} instead
   */
  // @Deprecated
  // public static native int resumeTask(Pointer task);
  /**
   * Original signature : <code>STATUS resumeTask(TASK)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\Task.h:432</i>
   */
  // public static native int resumeTask(HALLibrary.TASK task);
  /**
   * Original signature : <code>STATUS verifyTaskID(TASK)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\Task.h:434</i><br>
   *$
   * @deprecated use the safer methods
   *             {@link #verifyTaskID(edu.wpi.first.wpilibj.hal.HALLibrary.TASK)}
   *             and {@link #verifyTaskID(com.sun.jna.Pointer)} instead
   */
  // @Deprecated
  // public static native int verifyTaskID(Pointer task);
  /**
   * Original signature : <code>STATUS verifyTaskID(TASK)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\Task.h:434</i>
   */
  // public static native int verifyTaskID(HALLibrary.TASK task);
  /**
   * Original signature : <code>STATUS setTaskPriority(TASK, int)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\Task.h:436</i><br>
   *$
   * @deprecated use the safer methods
   *             {@link #setTaskPriority(edu.wpi.first.wpilibj.hal.HALLibrary.TASK, int)}
   *             and {@link #setTaskPriority(com.sun.jna.Pointer, int)} instead
   */
  // @Deprecated
  // public static native int setTaskPriority(Pointer task, int priority);
  /**
   * Original signature : <code>STATUS setTaskPriority(TASK, int)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\Task.h:436</i>
   */
  // public static native int setTaskPriority(HALLibrary.TASK task, int
  // priority);
  /**
   * Original signature : <code>STATUS getTaskPriority(TASK, int*)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\Task.h:438</i><br>
   *$
   * @deprecated use the safer methods
   *             {@link #getTaskPriority(edu.wpi.first.wpilibj.hal.HALLibrary.TASK, java.nio.IntBuffer)}
   *             and
   *             {@link #getTaskPriority(com.sun.jna.Pointer, com.sun.jna.ptr.IntByReference)}
   *             instead
   */
  // @Deprecated
  // public static native int getTaskPriority(Pointer task, IntByReference
  // priority);
  /**
   * Original signature : <code>STATUS getTaskPriority(TASK, int*)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\Task.h:438</i>
   */
  // public static native int getTaskPriority(HALLibrary.TASK task, IntBuffer
  // priority);
  /**
   * Original signature : <code>void* getPort(uint8_t)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\HAL.h:446</i>
   */
  // public static native Pointer getPort(byte pin);
  /**
   * Original signature : <code>uint16_t getFPGAVersion(int32_t*)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\HAL.h:452</i><br>
   *$
   * @deprecated use the safer methods
   *             {@link #getFPGAVersion(java.nio.IntBuffer)} and
   *             {@link #getFPGAVersion(com.sun.jna.ptr.IntByReference)} instead
   */
  // @Deprecated
  // public static native short getFPGAVersion(IntByReference status);
  /**
   * Original signature : <code>uint16_t getFPGAVersion(int32_t*)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\HAL.h:452</i>
   */
  // public static native short getFPGAVersion(IntBuffer status);
  /**
   * Original signature : <code>uint32_t getFPGARevision(int32_t*)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\HAL.h:454</i><br>
   *$
   * @deprecated use the safer methods
   *             {@link #getFPGARevision(java.nio.IntBuffer)} and
   *             {@link #getFPGARevision(com.sun.jna.ptr.IntByReference)}
   *             instead
   */
  // @Deprecated
  // public static native int getFPGARevision(IntByReference status);
  /**
   * Original signature : <code>uint32_t getFPGARevision(int32_t*)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\HAL.h:454</i>
   */
  // public static native int getFPGARevision(IntBuffer status);
  /**
   * Original signature : <code>uint32_t getFPGATime(int32_t*)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\HAL.h:456</i><br>
   *$
   * @deprecated use the safer methods {@link #getFPGATime(java.nio.IntBuffer)}
   *             and {@link #getFPGATime(com.sun.jna.ptr.IntByReference)}
   *             instead
   */
  // @Deprecated
  // public static native int getFPGATime(IntByReference status);
  /**
   * Original signature : <code>uint32_t getFPGATime(int32_t*)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\HAL.h:456</i>
   */
  // public static native int getFPGATime(IntBuffer status);
  /**
   * Original signature : <code>double testDouble(double)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\HAL.h:462</i>
   */
  public static native double testDouble(double param);

  /**
   * Original signature : <code>int32_t testInt32(int32_t)</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\HAL.h:464</i>
   */
  public static native int testInt32(int param);

  /**
   * Original signature : <code>void NumericArrayResize()</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\HAL.h:470</i>
   */
  public static native void NumericArrayResize();

  /**
   * Original signature : <code>void RTSetCleanupProc()</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\HAL.h:472</i>
   */
  public static native void RTSetCleanupProc();

  /**
   * Original signature : <code>void EDVR_CreateReference()</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\HAL.h:474</i>
   */
  public static native void EDVR_CreateReference();

  /**
   * Original signature : <code>void Occur()</code><br>
   * <i>native declaration : AthenaJava\target\native\include\HAL\HAL.h:476</i>
   */
  public static native void Occur();
}