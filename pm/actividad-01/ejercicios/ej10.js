import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';

export default function App() {
  let content = {
    paragraphOne: "Texto 1",
    paragraphTwo: "Texto 2",
    title: "Titulo"
  }

  function Article() {
    return (
      <View style={styles.container}>
        <Text style={styles.title}>{content.title}</Text>
        <Text>{content.paragraphOne}</Text>
        <Text>{content.paragraphTwo}</Text>
      </View>
    )
  }

  let arrArticles = [];

  for (let i = 0; i < 4; i++) {
    arrArticles.push(<Article key={i.toString}/>)
  }

  return (
    <>
      {arrArticles}
    </>
  );
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
    textDecorationiLine: 'underline'
  },
});