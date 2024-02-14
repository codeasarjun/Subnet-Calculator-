# Subnet-Calculator-
JavaFX application capable to calculate the subnet for given IP with correct class and other details.

<p>In networking, a subnet is a logical subdivision of an IP network.</p>

    <h2>Classes of IP Addresses</h2>
    <p>IP addresses are categorized into different classes:</p>
    <ul>
        <li><strong>Class A:</strong> Range from 1.0.0.0 to 126.255.255.255</li>
        <li><strong>Class B:</strong> Range from 128.0.0.0 to 191.255.255.255</li>
        <li><strong>Class C:</strong> Range from 192.0.0.0 to 223.255.255.255</li>
        <li><strong>Class D:</strong> Reserved for multicast addresses</li>
        <li><strong>Class E:</strong> Reserved for future use</li>
    </ul>

    <h2>Subnetting</h2>
    <p>Subnetting involves dividing a large network into smaller sub-networks to improve performance, security, and manageability.</p>

    <h3>Subnet Mask</h3>
    <p>A subnet mask is used to determine the network and host portions of an IP address.</p>

    <h3>Subnet Example</h3>
    <p>For example, with a Class C IP address 192.168.1.0 and a subnet mask of 255.255.255.0, the first three octets (192.168.1) represent the network portion, while the last octet (0) represents the host portion. Subnetting allows us to further divide this network into smaller subnets.</p>

    <h2>Benefits of Subnetting</h2>
    <ul>
        <li>Better network performance by reducing broadcast traffic.</li>
        <li>Improved security by logically separating different parts of the network.</li>
        <li>Easier network management and troubleshooting.</li>
    </ul>

    

<img  src='https://github.com/codeasarjun/Subnet-Calculator-/blob/main/pics/subnet_HomeUI.png'>
<img src='https://github.com/codeasarjun/Subnet-Calculator-/blob/main/pics/subnet_home_result.png'>
<img src='https://github.com/codeasarjun/Subnet-Calculator-/blob/main/pics/subnet_home_validation.png'>  




# Usage
Launch the application.<br>
Enter the IP address and subnet mask.<br>
Click on the "Calculate" button to obtain subnet details.<br>
View the calculated subnet information on the screen.<br>

