Pod::Spec.new do |s|
  s.name = 'EasyBlockchain'
  s.ios.deployment_target = '9.0'
  s.osx.deployment_target = '10.11'
  s.version = '0.10.4-SNAPSHOT'
  s.source = "{ :git => 'https://github.com/Sphereon-SDK/easy-blockchain-sdk.git', :tag => '0.10.4-SNAPSHOT' }"
  s.authors = 'Sphereon BV'
  s.license = Apache2
  s.homepage = 'https://sphereon.com'
  s.description = 'Easy Blockchain Swift4 SDK'
  s.source_files = 'EasyBlockchain/Classes/Swaggers/**/*.swift'
  s.dependency 'Alamofire', '~> 4.5'
end
