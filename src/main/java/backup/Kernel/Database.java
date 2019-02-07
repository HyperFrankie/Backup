package backup.Kernel;

import com.jcraft.jsch.*;

import java.io.InputStream;

public class Database {

    public Database() throws JSchException, SftpException {
        JSch jsch = new JSch();

        String knownHostsFilename = "/home/username/.ssh/known_hosts";
        jsch.setKnownHosts( knownHostsFilename );

        Session session = jsch.getSession( "remote-username", "remote-host" );
        session.setUserInfo(ui);


        session.connect();

        Channel channel = session.openChannel( "sftp" );
        channel.connect();

        ChannelSftp sftpChannel = (ChannelSftp) channel;

        sftpChannel.get("remote-file", "local-file" );
// OR
        InputStream in = sftpChannel.get( "remote-file" );
        // process inputstream as needed

        sftpChannel.exit();
        session.disconnect();
    }

}
