import { StatusBar } from 'expo-status-bar'; 
import { StyleSheet, Text, View, Image } from 'react-native'; 

export default function Article() {
    let content = {
        paragraphOne: "Texto 1",
        paragraphTwo: "Texto 2",
        title: "Titulo"
    }

    return (
        <View style={styles.container}> 
            <Text style={styles.title}>{content.title}</Text>
            <Text>{content.paragraphOne}</Text>
            <Text>{content.paragraphTwo}</Text>
            <Image 
                style={styles.logo}
                source={require('../assets/icon.png')}
            />
        </View>
    )
}

const styles = StyleSheet.create({ 
  container: { 
    flex: 1, 
    backgroundColor: 'gray', 
    alignItems: 'center', 
    justifyContent: 'center', 
  }, 
  title: {
    fontSize: 12,
    fontWeight: 'bold',
    fontStyle: 'italic',
    textDecorationLine: 'underline'
  },
  logo: {
    widht: 50,
    height: 50
  }
});