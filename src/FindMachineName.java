import java.net.InetAddress;
import java.net.UnknownHostException;

public class FindMachineName {
	public static void main(String[] args) {
		try {
			System.out.println("MachineName : " + FindMachineName.getInstallationComputerName());
		} catch (UnknownHostException e) {
			System.out.println("FindMachineName.main(...) : UnknownHostException e : " + e);
		}
	}
	private static String getInstallationComputerName() throws UnknownHostException {
		String strHostName = null;
		InetAddress addr = InetAddress.getLocalHost();
		strHostName = addr.getHostName();
		return strHostName;
	}
}
