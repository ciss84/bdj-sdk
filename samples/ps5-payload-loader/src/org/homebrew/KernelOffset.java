package org.homebrew;

public class KernelOffset {

    public static final long TARGETID;
    public static final long PRISON0;
    public static final long ROOTVNODE;
    public static final long SECURITY_FLAGS;
    public static final long QA_FLAGS;
    public static final long UTOKEN_FLAGS;

    public static final int PROC_UCRED  = 64;
    public static final int PROC_FD     = 72;
    public static final int PROC_PID    = 188;
    public static final int PROC_DYNLIB = 1000;

    public static final int DYNLIB_LIBKERNEL_OBJ = 24;
    public static final int DYNLIB_RESTRICT_FLAGS = 280;

    public static final int DYNLIB_OBJ_REFCOUNT = 24;
    
    static {
	switch(libkernel.getSystemSwVersion() & 0xffff0000) {

	case 0x3000000:
	    TARGETID        = 0x646647D;
	    ALLPROC         = 0x276DC58;
	    SECURITY_FLAGS  = 0x6466474;
	    QA_FLAGS        = 0x6466498;
	    UTOKEN_FLAGS    = 0x6466500;
	    PRISON0         = 0x1CC2670;
	    ROOTVNODE       = 0x67AB4C0;
	    break;

	case 0x3100000:
	    TARGETID        = 0x646647D;
	    ALLPROC         = 0x276DC58;
	    SECURITY_FLAGS  = 0x6466474;
	    QA_FLAGS        = 0x6466498;
	    UTOKEN_FLAGS    = 0x6466500;
	    PRISON0         = 0x1CC2670;
	    ROOTVNODE       = 0x67AB4C0;
	    break;

	case 0x3200000:
      TARGETID        = 0x646647D;	
	    ALLPROC         = 0x276DC58;
	    SECURITY_FLAGS  = 0x6466474;
	    QA_FLAGS        = 0x6466498;
	    UTOKEN_FLAGS    = 0x6466500;
	    PRISON0         = 0x1CC2670;
	    ROOTVNODE       = 0x67AB4C0;
	    break;
	    
	case 0x3210000:
	    TARGETID        = 0x646647D;
	    ALLPROC         = 0x276DC58;
	    PRISON0         = 0x1CC2670;
	    SECURITY_FLAGS  = 0x6466474;	    
	    QA_FLAGS        = 0x6466498;
	    UTOKEN_FLAGS    = 0x6466500;
	    ROOTVNODE       = 0x67AB4C0;
	    break;

	case 0x4000000:
      TARGETID        = 0x650647D;	
	    ALLPROC         = 0x27EDCB8;
	    SECURITY_FLAGS  = 0x6505474;
	    QA_FLAGS        = 0x6506498;
	    UTOKEN_FLAGS    = 0x6506500;
	    PRISON0         = 0x1D34D00;
	    ROOTVNODE       = 0x66E74C0;
	    break;

	case 0x4020000:
      TARGETID        = 0x650547D;	
	    ALLPROC         = 0x27EDCB8;
	    SECURITY_FLAGS  = 0x6505474;
	    QA_FLAGS        = 0x6505498;
	    UTOKEN_FLAGS    = 0x6505500;
	    PRISON0         = 0x1D34D00;
	    ROOTVNODE       = 0x66E64C0;
	    break;

	case 0x4030000:
	    TARGETID        = 0x650647D;
	    ALLPROC         = 0x27EDCB8;
	    SECURITY_FLAGS  = 0x6506474;
	    QA_FLAGS        = 0x6506498;
	    UTOKEN_FLAGS    = 0x6506500;
	    PRISON0         = 0x1D34D00;
	    ROOTVNODE       = 0x66E74C0;
	    break;

	case 0x4500000:
      TARGETID        = 0x650647D;	
	    ALLPROC         = 0x27EDCB8;
	    SECURITY_FLAGS  = 0x6506474;
	    QA_FLAGS        = 0x6506498;
	    UTOKEN_FLAGS    = 0x6506500;
	    PRISON0         = 0x1D34D00;
	    ROOTVNODE       = 0x66E74C0;
	    break;

	case 0x4510000:
      TARGETID        = 0x650647D;	
	    ALLPROC         = 0x27EDCB8;
	    SECURITY_FLAGS  = 0x6506474;
	    QA_FLAGS        = 0x6506498;
	    UTOKEN_FLAGS    = 0x6506500;
	    PRISON0         = 0x1D34D00;
	    ROOTVNODE       = 0x66E74C0;
	    break;
	    
	default:
      TARGETID        = 0;		
	    ALLPROC         = 0;
	    SECURITY_FLAGS  = 0;
	    QA_FLAGS        = 0;
	    UTOKEN_FLAGS    = 0;
	    PRISON0         = 0;
	    ROOTVNODE       = 0;
	}
    }
}
